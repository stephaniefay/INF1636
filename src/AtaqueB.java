package Map;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Cartas.cartas;
import Controle.Jogador;
import Controle.Territorio;

@SuppressWarnings("serial")
public class AtaqueB extends JPanel {
	private BufferedImage background;
	private ImageIcon ATK1 = new ImageIcon("Atk_1.png");
	private ImageIcon ATK2 = new ImageIcon("Atk_2.png");
	private ImageIcon ATK3 = new ImageIcon("Atk_3.png");
	private ImageIcon ATK4 = new ImageIcon("Atk_4.png");
	private ImageIcon ATK5 = new ImageIcon("Atk_5.png");
	private ImageIcon ATK6 = new ImageIcon("Atk_6.png");
	private ImageIcon DEF1 = new ImageIcon("Def_1.png");
	private ImageIcon DEF2 = new ImageIcon("Def_2.png");
	private ImageIcon DEF3 = new ImageIcon("Def_3.png");
	private ImageIcon DEF4 = new ImageIcon("Def_4.png");
	private ImageIcon DEF5 = new ImageIcon("Def_5.png");
	private ImageIcon DEF6 = new ImageIcon("Def_6.png");
	int resultado1 = 0, resultado2 = 0;
	JPanel pane2 = new JPanel(new GridLayout(2,3));
	JLabel i = new JLabel();
	JLabel j = new JLabel();
	JLabel k = new JLabel();
	JLabel l = new JLabel();
	JLabel m = new JLabel();
	JLabel n = new JLabel();
	private ImageIcon ButtonFechar = new ImageIcon ("Button.png");
	private ImageIcon ButtonAtacar = new ImageIcon ("Button2.png");
	
	public AtaqueB (Territorio t1, Territorio t2) {
		this.setLayout(new BorderLayout());
		this.setOpaque(false);
		try {
			background = ImageIO.read(new File("Janela.png"));
		}
		catch (IOException ex) {
			System.out.println(ex.getMessage());
			System.exit(1);
		}
		
		JLabel bt = new JLabel (ButtonFechar);
		bt.addMouseListener(new MouseListener () {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				((Window) getRootPane().getParent()).dispose();
				
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
		add(bt, BorderLayout.SOUTH);
		JLabel label1 = new JLabel ("<html><font size='4' face='Verdana' color='white'>Ataque entre "+t1.retName()+ " e "+t2.retName()+"</font></html>");
		JLabel bt2 = new JLabel (ButtonAtacar);
		
		JPanel pane = new JPanel (new BorderLayout());
		pane.add(label1, BorderLayout.NORTH);
		label1.setHorizontalAlignment(JLabel.CENTER);
		pane.setOpaque(false);
		pane2.setOpaque(false);
		bt2.addMouseListener(new MouseListener () {

			@Override
			public void mouseClicked(MouseEvent g) {
				int a, b, c, d, e, f;
				
				Random r = new Random();
				a = r.nextInt(6)+1;
				b = r.nextInt(6)+1;
				c = r.nextInt(6)+1;
				d = r.nextInt(6)+1;
				e = r.nextInt(6)+1;
				f = r.nextInt(6)+1;
				
				resultado1 = a + b + c;
				resultado2 = d + e + f;
				
				i.setIcon(escolheDadoA(a));
				j.setIcon(escolheDadoA(b));
				k.setIcon(escolheDadoA(c));
				
				l.setIcon(escolheDadoD(d));
				m.setIcon(escolheDadoD(e));
				n.setIcon(escolheDadoD(f));
				
				playerTerritorios aux = new playerTerritorios();
				List<Jogador> aux2 = new Jogador().retListaJ();
				
				if (resultado1 > resultado2) {
					label1.setText("<html><font size='5' face='Verdana' color='white'>Exército " + t1.retCorJogador() +" venceu!</font></html>");
					label1.setHorizontalAlignment(JLabel.CENTER);
					
					if(t2.qtdPecas() == 1 ) {
						t2.preencheCor(t1.retCorJogador());
						t2.preencheJogador(t1.retJogador());
						
						aux2.get(t1.retJogador()).botaLista(t2.getName());
						aux2.get(t2.retJogador()).retLista(t2.getName());
						t2.qtdPecas (3);
						t1.qtdPecas (t1.qtdPecas()-3);
						
						aux.changeLabel(t1.retIndex(), t1.qtdTerString());
						aux.changeLabel(t2.retIndex(), t2.qtdTerString());
						aux.changeTerritorio(t2, aux2.get(t2.retJogador()));
						
						new cartas().preencheLista(t1.retJogador());
						
						}
					
					
					
						else {
							t2.qtdPecas(t2.qtdPecas()-3);
							aux.changeLabel(t1.retIndex(), t1.qtdTerString());
							aux.changeLabel(t2.retIndex(), t2.qtdTerString());

						}
				}
				else {
					label1.setText("<html><font size='5' face='Verdana' color='white'>Exército " + t2.retCorJogador() +" se defende!</font></html>");
					label1.setHorizontalAlignment(JLabel.CENTER);
					t1.qtdPecas (t1.qtdPecas()-3);
					
					aux.changeLabel(t1.retIndex(), t1.qtdTerString());
					aux.changeLabel(t2.retIndex(), t2.qtdTerString());

				}
				
				pane.remove(bt2);		
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
		
		pane.add(bt2);
		
		add(pane, BorderLayout.NORTH);
		
		pane2.add(i);
		pane2.add(j);
		pane2.add(k);
		pane2.add(l);
		pane2.add(m);
		pane2.add(n);
		
		JPanel meh = new JPanel(); 
		JLabel meh2 = new JLabel ("                ");
		meh.add(meh2);
		add(meh, BorderLayout.WEST);
		meh.setOpaque(false);
		add(pane2, BorderLayout.CENTER);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(background, 0, 0, 300, 240, null);
	}
	
	private ImageIcon escolheDadoA (int a) {
		switch (a) {
		case 1:
			return ATK1;
		case 2:
			return ATK2;
		case 3:
			return ATK3;
		case 4:
			return ATK4;
		case 5:
			return ATK5;
		case 6:
			return ATK6;
		}
		return null;
	}

	private ImageIcon escolheDadoD (int a) {
		switch (a) {
		case 1:
			return DEF1;
		case 2:
			return DEF2;
		case 3:
			return DEF3;
		case 4:
			return DEF4;
		case 5:
			return DEF5;
		case 6:
			return DEF6;
		}
		return null;
	}
}
