package Map;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Cartas.cartas;
import Controle.Coordenada;
import Controle.Jogador;
import Controle.Territorio;

@SuppressWarnings("serial")
public class drawMap extends Coordenada implements ListSelectionListener {
	private JSplitPane splitPane;
	private JButton finalButton = new JButton ("OK");
	private BufferedImage background;
	public JPanel pane = new JPanel (new BorderLayout());
	public List<Jogador> lst;
	public JLabel label1 = new JLabel();
	JLabel label2 = new JLabel ();
	JList<?> lista;
	public int lstJogadorIndex = 0;
	private JButton adicionaPeca = new JButton ("Incluir Exército");
	public int flag = 0, lstTerritorioIndex, flag2 = 0, uber;
	private playerTerritorios indices;
	private static drawMap instance;
	public ImageIcon verso = new ImageIcon("verso_cartas.png");
	public ImageIcon verso2 = new ImageIcon("verso_objetivo.png");
	public ImageIcon button = new ImageIcon ("Button2.png");
	public ImageIcon button2 = new ImageIcon ("Button3.png");
	
	public static drawMap getInstance() {
		if (instance == null) {
			synchronized(drawMap.class) {
				if (instance == null) {
					instance = new drawMap();
				}
			}            
		}

		return instance;
	}

	
	public drawMap () {
		
		this.setLayout(null);
		Jogador aux = new Jogador();
		lst = aux.retListaJ();
		final Jogador j = lst.get(0);
		attPosicao(lstJogadorIndex);

		try {
			background = ImageIO.read(new File("Background.png"));
		}
		catch (IOException ex) {
			System.out.println(ex.getMessage());
			System.exit(1);
		}
		printJogador();
		
		JLabel botao = new JLabel (button);
		
		botao.setVisible(true);
		botao.setFont(new Font("Verdana",Font.PLAIN, 20));
		Dimension size = botao.getPreferredSize();
		botao.setBounds(650, 60, size.width, size.height);
		botao.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (flag == 0) {
            		ehAtaque();
            		flag++;
            		updateLabel();
            		botao.setIcon(button2);
            	}
            	else {
            		if (lstJogadorIndex == j.getMax()) {
            			lstJogadorIndex = 0;
            		}
            		else {
            			lstJogadorIndex++;
            		}
            		lst.get(lstJogadorIndex).attPecas();
            		attPosicao(lstJogadorIndex);
            		distribuiPecas();
            		botao.setIcon(button);
            		flag--;
            		updateLabel();
            	}
                
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		add(botao);
		distribuiTerritorios ();
		distribuiPecas();
		indices = new playerTerritorios(this);
		updateLabel2();
		new cartas().objetivo(lst);
		
		JLabel label3 = new JLabel (verso);
		label3.setToolTipText("Ver suas cartas");
		label3.addMouseListener(new MouseListener () {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				mostraCartas();
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		label3.setBounds(900, 0, 80, 120);
		label3.setVisible(true);
		
		add(label3);
		
		JLabel label4 = new JLabel (verso2);
		label4.setToolTipText("Ver seu objetivo");
		label4.addMouseListener(new MouseListener () {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				mostraObjetivo();
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		label4.setBounds(800, 0, 80, 120);
		label4.setVisible(true);
		
		add(label4);
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(background, 0, 0, 1024, 768, null);
	}
	
	private void printJogador () {
		Jogador t = lst.get(lstJogadorIndex);
		label1.setFont(new Font("Verdana",Font.PLAIN, 20));
		label1.setForeground(Color.white);
		label1.setText("<html>Exército " + t.getCor() + " distribua suas peças!</html>");
		label1.setBounds(400,0,500,70);
		label1.setVisible(true);
		add(label1);
	}
	
	private void updateLabel () {
		Jogador t = lst.get(lstJogadorIndex);
		if (flag == 0) {
			label1.setText("<html>Exército " + t.getCor() + " distribua suas peças!</html>");
		}
		else {
			label1.setText("<html>Exército " + t.getCor() + " ataque!</html>");
		}
	}

	public void updateLabel2 () {
		int aux = 0;
		for (Territorio t : lstTerritorios) {
			indices.changeLabel(aux, t.qtdTerString());
			aux++;
			}
		}
	

	public void distribuiTerritorios () {
		int territorios = lstTerritorios.size()-1, lstJogadorIndex1 = 0, lstJogadorIndex2 = 0;
		Collections.shuffle(lstTerritorios);
			lst.get(lstJogadorIndex2).botaLista(lstTerritorios.get(lstJogadorIndex1).retName());
			lstTerritorios.get(lstJogadorIndex1).preencheJogador(lst.get(lstJogadorIndex2).getVez());
			lstTerritorios.get(lstJogadorIndex1).attPecas(0);
			lstTerritorios.get(lstJogadorIndex1).preencheCor(lst.get(lstJogadorIndex2).getCor());
			lstJogadorIndex1++;
			for(; lstJogadorIndex1 <= territorios; lstJogadorIndex1++) {
				if (lstJogadorIndex2 < lst.get(lstJogadorIndex2).getMax() )
					lstJogadorIndex2++;
				else
					lstJogadorIndex2 = 0;
				lst.get(lstJogadorIndex2).botaLista(lstTerritorios.get(lstJogadorIndex1).retName());
				lstTerritorios.get(lstJogadorIndex1).preencheJogador(lst.get(lstJogadorIndex2).getVez());
				lstTerritorios.get(lstJogadorIndex1).attPecas(0);
				lstTerritorios.get(lstJogadorIndex1).preencheCor(lst.get(lstJogadorIndex2).getCor());
			}

	}
	
	public void distribuiPecas () {
		JFrame  frame = new JFrame ();
		
		String a [] = new String [lst.get(lstJogadorIndex).retLista().size()];
		
		int contador = 0;
		
		for (String stri : lst.get(lstJogadorIndex).retLista()) {
			a[contador] = stri;
			contador++;
		}
		
		lista = new JList<Object> (a);
		lista.setSelectedIndex(0);
		lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lista.addListSelectionListener(this);
		
        JScrollPane listScrollPane = new JScrollPane(lista);
        
        
        label2.setHorizontalAlignment(JLabel.CENTER);
        pane.add(label2, BorderLayout.NORTH);
        
        JScrollPane labelscrollpane = new JScrollPane(pane);
        
        splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, listScrollPane, labelscrollpane);
        splitPane.setOneTouchExpandable(false);
        splitPane.setDividerLocation(150);

        
        Dimension minimumSize = new Dimension(100, 50);
        listScrollPane.setMinimumSize(minimumSize);
        labelscrollpane.setMinimumSize(minimumSize);

        splitPane.setPreferredSize(new Dimension(400, 200));
        updateLabel(lista.getSelectedIndex());
        
        finalButton.setVisible(true);
		finalButton.setFont(new Font("Verdana",Font.PLAIN, 20));
		Dimension size = finalButton.getPreferredSize();
		finalButton.setBounds(420, 450, size.width, size.height);
		finalButton.setBackground(Color.white);
		finalButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
            	if (lst.get(lstJogadorIndex).retPecas() == 0) {
            		frame.setVisible(false);
            	}
            	else {
            		JFrame j = new JFrame ();
            		j.setAlwaysOnTop(true);
        			JOptionPane.showMessageDialog(j, "Termine de gastar seus exércitos.", "Aviso", JOptionPane.ERROR_MESSAGE);
            	}
            		
            }
        });
		if (flag2 == 0) {
			frame.getContentPane().remove(splitPane);
			adicionaPeca.setVisible(true);
			adicionaPeca.setFont(new Font("Verdana",Font.PLAIN, 20));
			size = adicionaPeca.getPreferredSize();
			adicionaPeca.setBounds(420, 450, size.width, size.height);
			adicionaPeca.setBackground(Color.white);
			adicionaPeca.addActionListener(new ActionListener(){
	            @Override
	            public void actionPerformed(ActionEvent arg0) {
	            	mexeTerritorio();
	            }
	        });
			
			pane.add(adicionaPeca, BorderLayout.CENTER);
			flag2++;
		}
		
		pane.add(finalButton, BorderLayout.SOUTH);
		frame.setAlwaysOnTop(true);
		frame.setSize(500,300);
		frame.setTitle("Distribuição de Peças");
		frame.getContentPane().add(splitPane);

		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		
		
	}
	
	
	public void valueChanged(ListSelectionEvent e) {
        JList<?> lista = (JList<?>)e.getSource();
        updateLabel(lista.getSelectedIndex());
    }
	
	protected void updateLabel (int lstTerJogIndex) {
		int contador = 0;
		lstTerritorioIndex = 0;
		for (Territorio t : lstTerritorios) {
			if (t.retName() == lst.get(lstJogadorIndex).retLista().get(lstTerJogIndex)) {
				lstTerritorioIndex = contador;
				break;
			}
			contador++;
		}
		
	    label2.setText("<html>Você possui " + lstTerritorios.get(lstTerritorioIndex).qtdPecas + " exército(s) no(a) " + 
	    lst.get(lstJogadorIndex).retLista().get(lstTerJogIndex) + " <br>E ainda possui " + lst.get(lstJogadorIndex).retPecas() + " exército(s) para distribuir.</html> " );
	    
	    
	    
	}
	

	protected void mexeTerritorio () {
		if (lst.get(lstJogadorIndex).retPecas() == 0) {
			JFrame j = new JFrame ();
			j.setAlwaysOnTop(true);
			JOptionPane.showMessageDialog(j, "Você já gastou todas suas unidades!", "Aviso", JOptionPane.ERROR_MESSAGE);
		}
		else {			
			int aux = lst.get(lstJogadorIndex).retPecas();
			lst.get(lstJogadorIndex).dimPecas(aux-1);
			lstTerritorios.get(lstTerritorioIndex).attPecas(0);
			updateLabel(lista.getSelectedIndex());
			for (Territorio t : lstTerritorios) {
				if (t.retName() == lista.getSelectedValue()){
					indices.changeLabel(t.retIndex(), t.qtdTerString());
					break;
				}
			}
			
		}
	}
	
	public void mostraObjetivo () {
		new cartas().mostraObjetivo(lst.get(lstJogadorIndex));
	}
	public void mostraCartas() {
		new cartas().cardFrame(lstJogadorIndex);
	}
	
}