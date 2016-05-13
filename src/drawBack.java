package Inicial;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Controle.Jogador;
import Controle.MyComparator;
import Map.mapa;

@SuppressWarnings("serial")
public class drawBack extends JPanel implements ActionListener {
	public String[] Joga = { "3 Jogadores", "4 Jogadores", "5 Jogadores", "6 Jogadores" };
	public String[] cor = { "Vermelho", "Laranja", "Azul", "Verde", "Branco", "Preto" };
	public String[] pos = { "Primeiro", "Segundo", "Terceiro", "Quarto", "Quinto", "Sexto" };
	private BufferedImage background;
	public JComboBox<?> jogadores = new JComboBox<String>(Joga);
	private JButton startButton = new JButton ("Novo Jogo");
	private JButton finalButton = new JButton ("Finalizar Jogo");
	public List<Jogador> lstJogador = new ArrayList<Jogador>();
	public JLabel label1 = new JLabel();

	public drawBack () {
		this.setLayout(null);
		try {
			background = ImageIO.read(new File("Inicio.png"));
		}
		catch (IOException ex) {
			System.out.println(ex.getMessage());
			System.exit(1);
		}
		startButton.setFont(new Font("Verdana",Font.PLAIN, 20));
		Dimension size = startButton.getPreferredSize();
		startButton.setBounds(100, 250, size.width, size.height);
		
		startButton.setBackground(Color.white);
		startButton.addMouseListener(new MouseListener () {

			@Override
			public void mouseClicked(MouseEvent e) {
				startButton.setVisible(false);
				finalButton.setVisible(false);
				remove(startButton);
				remove(finalButton);
				apareceMenu();
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		add(startButton);    
	    
		finalButton.setVisible(true);
		finalButton.setFont(new Font("Verdana",Font.PLAIN, 20));
		size = finalButton.getPreferredSize();
		finalButton.setBounds(250, 250, size.width, size.height);
		finalButton.setBackground(Color.white);
		finalButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
            	((Window) getRootPane().getParent()).dispose();
            }
        });
		
		add(finalButton);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(background, 0, 0, 500, 400, null);
	}
	
	protected void apareceMenu () {
		
       
       
		jogadores.setVisible(true);
		jogadores.setSize(150, 30);
        jogadores.setSelectedIndex(3);
        jogadores.addActionListener(this);
        jogadores.setBounds(180, 250, 150, 30);
        jogadores.setBackground(Color.white);
        jogadores.setFont(new Font("Verdana",Font.PLAIN, 20));
        add(jogadores);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JComboBox<?> cb = (JComboBox<?>)e.getSource();
        jogadores.setVisible(false);
        remove(jogadores);
        apareceLabel();
        calcCor(cb.getSelectedIndex());
	}
	
	private void calcCor (int i) {
		int contador, auxiliar, aux = i+2;
		Random rand = new Random();
		for (i+=3; i>0; i--) {
			auxiliar = rand.nextInt(6);
			while (cor[auxiliar] == null) {
				auxiliar++;
				if (auxiliar >= cor.length) {
					auxiliar = 0;
				}
			}
			cor[auxiliar] = null;
			contador = rand.nextInt(1000);
			lstJogador.add(new Jogador(auxiliar, contador, aux));
			
		}
		
		integridadeVez();
		Finalizacao();
	}
	
	private void integridadeVez () {
		int auxiliar = 0;
		for(Jogador t : lstJogador) {
			if (auxiliar == t.getVez()) {
				t.attVez(auxiliar++);
			}
			auxiliar = t.getVez();
		}
		
		
	}
	
	private void apareceLabel() {
		label1.setVisible(true);
		label1.setBounds(30,125,500,300);
		label1.setFont(new Font("Verdana",Font.PLAIN, 20));
		label1.setForeground(Color.white);
        add(label1);
        
	}
	
	private void Finalizacao () {
		try {
			background = ImageIO.read(new File("Inicio_2.png"));
		}
		catch (IOException ex) {
			System.out.println(ex.getMessage());
			System.exit(1);
		} 
		
		repaint();
		int contador = 0;
		Collections.sort(lstJogador, new MyComparator());
		
		String txtt = "<html>";
		
		for(Jogador t : lstJogador) {
			txtt += "Exército "+ t.getCor() +" é o "+pos[contador]+"<br>";
			lstJogador.get(contador).attVez(contador);
			contador++;
		}
		
		txtt+="</html>";
		
		label1.setText(txtt);
		
		startButton.setVisible(true);
		startButton.setText("Começar o Jogo!");
		startButton.setFont(new Font("Verdana",Font.PLAIN, 14));
		Dimension size = startButton.getPreferredSize();
		startButton.setBounds(320, 340, size.width, size.height);
		startButton.setBackground(Color.white);
		startButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
            	((Window) getRootPane().getParent()).dispose();
            	lstJogador.get(0).preenchePlayers(lstJogador);
            	new mapa();
            }
        });
		
		add(startButton);
	}

	
}
