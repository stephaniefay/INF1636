package Cartas;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Controle.Jogador;

public class cartas {
	
	public ImageIcon  Coringa = new ImageIcon("coringa.png");
	
	public ImageIcon  carta01 = new ImageIcon("0.png");
	public ImageIcon  carta02 = new ImageIcon("1.png");
	public ImageIcon  carta03 = new ImageIcon("2.png");
	public ImageIcon  carta04 = new ImageIcon("3.png");
	public ImageIcon  carta05 = new ImageIcon("4.png");
	public ImageIcon  carta06 = new ImageIcon("5.png");
	public ImageIcon  carta07 = new ImageIcon("6.png");
	public ImageIcon  carta08 = new ImageIcon("7.png");
	public ImageIcon  carta09 = new ImageIcon("8.png");
	public ImageIcon  carta10 = new ImageIcon("9.png");

	public ImageIcon  carta11 = new ImageIcon("10.png");
	public ImageIcon  carta12 = new ImageIcon("11.png");
	public ImageIcon  carta13 = new ImageIcon("12.png");
	public ImageIcon  carta14 = new ImageIcon("13.png");
	public ImageIcon  carta15 = new ImageIcon("14.png");
	public ImageIcon  carta16 = new ImageIcon("15.png");
	public ImageIcon  carta17 = new ImageIcon("16.png");
	public ImageIcon  carta18 = new ImageIcon("17.png");
	public ImageIcon  carta19 = new ImageIcon("18.png");
	public ImageIcon  carta20 = new ImageIcon("19.png");

	public ImageIcon  carta21 = new ImageIcon("20.png");
	public ImageIcon  carta22 = new ImageIcon("21.png");
	public ImageIcon  carta23 = new ImageIcon("22.png");
	public ImageIcon  carta24 = new ImageIcon("23.png");
	public ImageIcon  carta25 = new ImageIcon("24.png");
	public ImageIcon  carta26 = new ImageIcon("25.png");
	public ImageIcon  carta27 = new ImageIcon("26.png");
	public ImageIcon  carta28 = new ImageIcon("27.png");
	public ImageIcon  carta29 = new ImageIcon("28.png");
	public ImageIcon  carta30 = new ImageIcon("29.png");

	public ImageIcon  carta31 = new ImageIcon("30.png");
	public ImageIcon  carta32 = new ImageIcon("31.png");
	public ImageIcon  carta33 = new ImageIcon("32.png");
	public ImageIcon  carta34 = new ImageIcon("33.png");
	public ImageIcon  carta35 = new ImageIcon("34.png");
	public ImageIcon  carta36 = new ImageIcon("35.png");
	public ImageIcon  carta37 = new ImageIcon("36.png");
	public ImageIcon  carta38 = new ImageIcon("37.png");
	public ImageIcon  carta39 = new ImageIcon("38.png");
	public ImageIcon  carta40 = new ImageIcon("39.png");

	public ImageIcon  carta41 = new ImageIcon("40.png");
	public ImageIcon  carta42 = new ImageIcon("41.png");
	public ImageIcon  carta43 = new ImageIcon("42.png");
	public ImageIcon  carta44 = new ImageIcon("43.png");
	public ImageIcon  carta45 = new ImageIcon("44.png");
	public ImageIcon  carta46 = new ImageIcon("45.png");
	public ImageIcon  carta47 = new ImageIcon("46.png");
	public ImageIcon  carta48 = new ImageIcon("47.png");
	public ImageIcon  carta49 = new ImageIcon("48.png");
	public ImageIcon  carta50 = new ImageIcon("49.png");

	public ImageIcon  carta51 = new ImageIcon("50.png");
	
	public List<ImageIcon>lstCartasJ1 = new ArrayList <ImageIcon> ();
	public List<ImageIcon>lstCartasJ2 = new ArrayList <ImageIcon> ();
	public List<ImageIcon>lstCartasJ3 = new ArrayList <ImageIcon> ();
	public List<ImageIcon>lstCartasJ4 = new ArrayList <ImageIcon> ();
	public List<ImageIcon>lstCartasJ5 = new ArrayList <ImageIcon> ();
	public List<ImageIcon>lstCartasJ6 = new ArrayList <ImageIcon> ();

	private List<ImageIcon> lstCartasQuadrado = new ArrayList <ImageIcon> ();
	private List<ImageIcon> lstCartasTriangulo = new ArrayList <ImageIcon> ();
	private List<ImageIcon> lstCartasCirculo = new ArrayList <ImageIcon> ();
	
	public List<ImageIcon> lstCartas = new ArrayList <ImageIcon>();
	private static cartas Cartas = null;
	
	public String[] Objetivos = { "Conquistar na totalidade a EUROPA, a OCEANIA e mais um terceiro.",
								  "Conquistar na totalidade a ASIA e a AMÉRICA DO SUL.",
								  "Conquistar na totalidade a EUROPA, a AMÉRICA DO SUL e mais um terceiro.",
								  "Conquistar 18 TERRITÓRIOS e ocupar cada um deles com pelo menos dois exércitos.",
								  "Conquistar na totalidade a ASIA e a ÁFRICA.",
								  "Conquistar na totalidade a AMÉRICA DO NORTE e a ÁFRICA.",
								  "Conquistar 24 TERRITÓRIOS à sua escolha.",
								  "Conquistar na totalidade a AMÉRICA DO NORTE e a OCEANIA."
								   };
	
	{

		lstCartas.add(carta01);
		lstCartas.add(carta02);
		lstCartas.add(carta03);
		lstCartas.add(carta04);
		lstCartas.add(carta05);
		lstCartas.add(carta06);
		lstCartas.add(carta07);
		lstCartas.add(carta08);
		lstCartas.add(carta09);
		lstCartas.add(carta10);

		lstCartas.add(carta11);
		lstCartas.add(carta12);
		lstCartas.add(carta13);
		lstCartas.add(carta14);
		lstCartas.add(carta15);
		lstCartas.add(carta16);
		lstCartas.add(carta17);
		lstCartas.add(carta18);
		lstCartas.add(carta19);
		lstCartas.add(carta20);

		lstCartas.add(carta21);
		lstCartas.add(carta22);
		lstCartas.add(carta23);
		lstCartas.add(carta24);
		lstCartas.add(carta25);
		lstCartas.add(carta26);
		lstCartas.add(carta27);
		lstCartas.add(carta28);
		lstCartas.add(carta29);
		lstCartas.add(carta30);

		lstCartas.add(carta30);
		lstCartas.add(carta31);
		lstCartas.add(carta32);
		lstCartas.add(carta33);
		lstCartas.add(carta34);
		lstCartas.add(carta35);
		lstCartas.add(carta36);
		lstCartas.add(carta37);
		lstCartas.add(carta38);
		lstCartas.add(carta39);
		lstCartas.add(carta40);

		lstCartas.add(carta41);
		lstCartas.add(carta42);
		lstCartas.add(carta43);
		lstCartas.add(carta44);
		lstCartas.add(carta45);
		lstCartas.add(carta46);
		lstCartas.add(carta47);
		lstCartas.add(carta48);
		lstCartas.add(carta49);
		lstCartas.add(carta50);

		lstCartas.add(carta51);
		lstCartas.add(Coringa);
		
		Collections.shuffle(lstCartas);
		
		lstCartasQuadrado.add(carta06);
		lstCartasQuadrado.add(carta08);
		lstCartasQuadrado.add(carta09);
		lstCartasQuadrado.add(carta13);
		lstCartasQuadrado.add(carta15);
		lstCartasQuadrado.add(carta19);
		lstCartasQuadrado.add(carta22);
		lstCartasQuadrado.add(carta26);
		lstCartasQuadrado.add(carta32);
		lstCartasQuadrado.add(carta33);
		lstCartasQuadrado.add(carta37);
		lstCartasQuadrado.add(carta40);
		lstCartasQuadrado.add(carta41);
		lstCartasQuadrado.add(carta44);
		lstCartasQuadrado.add(carta50);

		lstCartasTriangulo.add(carta01);
		lstCartasTriangulo.add(carta04);
		lstCartasTriangulo.add(carta07);
		lstCartasTriangulo.add(carta10);
		lstCartasTriangulo.add(carta11);
		lstCartasTriangulo.add(carta14);
		lstCartasTriangulo.add(carta17);
		lstCartasTriangulo.add(carta21);
		lstCartasTriangulo.add(carta23);
		lstCartasTriangulo.add(carta25);
		lstCartasTriangulo.add(carta31);
		lstCartasTriangulo.add(carta34);
		lstCartasTriangulo.add(carta36);
		lstCartasTriangulo.add(carta38);
		lstCartasTriangulo.add(carta43);
		lstCartasTriangulo.add(carta46);
		lstCartasTriangulo.add(carta47);
		lstCartasTriangulo.add(carta48);
		lstCartasTriangulo.add(carta49);

		lstCartasCirculo.add(carta02);
		lstCartasCirculo.add(carta03);
		lstCartasCirculo.add(carta05);
		lstCartasCirculo.add(carta12);
		lstCartasCirculo.add(carta16);
		lstCartasCirculo.add(carta18);
		lstCartasCirculo.add(carta20);
		lstCartasCirculo.add(carta24);
		lstCartasCirculo.add(carta27);
		lstCartasCirculo.add(carta28);
		lstCartasCirculo.add(carta29);
		lstCartasCirculo.add(carta30);
		lstCartasCirculo.add(carta35);
		lstCartasCirculo.add(carta39);
		lstCartasCirculo.add(carta42);
		lstCartasCirculo.add(carta51);		
	}
	
	public  cartas () {
		
	}
	
	public static cartas getInstance() {
	      if(Cartas == null) {
	         Cartas = new cartas();
	      }
	      return Cartas;
	}
	
	public void preencheLista (int flag) {
		JFrame j = new JFrame ();
		switch (flag) {
		case 0:
			if (lstCartasJ1.isEmpty()) {
				lstCartasJ1.add(lstCartas.get(0));
				lstCartas.remove(0);
				
			}
			else {
				if (lstCartasJ1.size() == 5) {
					JOptionPane.showMessageDialog(j, "Você já possui cinco cartas. Para receber novas, primeiro gaste as que você possui.", "Aviso", JOptionPane.ERROR_MESSAGE);
					break;
				}
				else {
					lstCartasJ1.add(lstCartas.get(0));
					lstCartas.remove(0);

				}
			}
			break;
		case 1:
			if (lstCartasJ2.isEmpty()) {
				lstCartasJ2.add(lstCartas.get(0));
				lstCartas.remove(0);

			}
			else {
				if (lstCartasJ2.size() == 5) {
					JOptionPane.showMessageDialog(j, "Você já possui cinco cartas. Para receber novas, primeiro gaste as que você possui.", "Aviso", JOptionPane.ERROR_MESSAGE);
					break;
				}
				else {
					lstCartasJ2.add(lstCartas.get(0));
					lstCartas.remove(0);
				}
			}
			break;
		case 2:
			if (lstCartasJ3.isEmpty()) {
				lstCartasJ3.add(lstCartas.get(0));
				lstCartas.remove(0);
			}
			else {
				if (lstCartasJ3.size() == 5) {
					JOptionPane.showMessageDialog(j, "Você já possui cinco cartas. Para receber novas, primeiro gaste as que você possui.", "Aviso", JOptionPane.ERROR_MESSAGE);
					break;
				}
				else {
					lstCartasJ3.add(lstCartas.get(0));
					lstCartas.remove(0);
				}
			}
			break;
		case 3:
			if (lstCartasJ4.isEmpty()) {
				lstCartasJ4.add(lstCartas.get(0));
				lstCartas.remove(0);
			}
			else {
				if (lstCartasJ4.size() == 5) {
					JOptionPane.showMessageDialog(j, "Você já possui cinco cartas. Para receber novas, primeiro gaste as que você possui.", "Aviso", JOptionPane.ERROR_MESSAGE);
					break;
				}
				else {
					lstCartasJ4.add(lstCartas.get(0));
					lstCartas.remove(0);
				}
			}
			break;
		case 4:
			if (lstCartasJ5.isEmpty()) {
				lstCartasJ5.add(lstCartas.get(0));
				lstCartas.remove(0);
			}
			else {
				if (lstCartasJ5.size() == 5) {
					JOptionPane.showMessageDialog(j, "Você já possui cinco cartas. Para receber novas, primeiro gaste as que você possui.", "Aviso", JOptionPane.ERROR_MESSAGE);
					break;
				}
				else {
					lstCartasJ5.add(lstCartas.get(0));
					lstCartas.remove(0);
				}
			}
			break;
		case 5:
			if (lstCartasJ6.isEmpty()) {
				lstCartasJ6.add(lstCartas.get(0));
				lstCartas.remove(0);
			}
			else {
				if (lstCartasJ6.size() == 5) {
					JOptionPane.showMessageDialog(j, "Você já possui cinco cartas. Para receber novas, primeiro gaste as que você possui.", "Aviso", JOptionPane.ERROR_MESSAGE);
					break;
				}
				else {
					lstCartasJ6.add(lstCartas.get(0));
					lstCartas.remove(0);
				}
			}
			break;
		}
	}

	public void objetivo (List<Jogador> players) {
		int nums [] = {-1, -1, -1, -1, -1, -1};
		for (int i = 0; i < players.size(); i++) {
			Random r = new Random();
			int woops = r.nextInt(8);
			
			for (int auxiliar=0; auxiliar < 6; auxiliar++) {
				if (nums[auxiliar] == woops) {
					woops = r.nextInt(8);
					auxiliar = 0;
				}
			}
			
			players.get(i).colocaObjetivo(woops);
			nums[i] = woops;
		}
	}

	public void mostraObjetivo (Jogador play) {
		new Objetivo(play, Objetivos);
	}

	public void cardFrame (int pos) {
		
		JFrame j = new JFrame ();
		ImageIcon img = new ImageIcon("Icon.png");
		
		
		j.setResizable(false);
		j.setIconImage(img.getImage());
		j.setTitle("Cartas");
		
		JPanel pane = new JPanel (new GridLayout (1,5));
		
		JLabel label1 = null;
		JLabel label2 = null;
		JLabel label3 = null;
		JLabel label4 = null;
		JLabel label5 = null;
		
		switch (pos) {
		case 0:
			if (lstCartasJ1.size()  >= 1) {
				label1 = new JLabel (lstCartasJ1.get(0));
				if (lstCartasJ1.size() >= 2) {
					label2 = new JLabel (lstCartasJ1.get(1));
					if (lstCartasJ1.size() >= 3) {
						label3 = new JLabel (lstCartasJ1.get(2));
						if (lstCartasJ1.size() >= 4) {
							label4 = new JLabel (lstCartasJ1.get(3));
							if (lstCartasJ1.size() == 5) {
								label5 = new JLabel (lstCartasJ1.get(4));
							}
						}
					}
				}
			}
			else {
				label1 = new JLabel ("Você não possui nenhuma carta.");
			}
			break;
		case 1:
			if (lstCartasJ1.size()  >= 1) {
				label1 = new JLabel (lstCartasJ1.get(0));
				if (lstCartasJ1.size() >= 2) {
					label2 = new JLabel (lstCartasJ1.get(1));
					if (lstCartasJ1.size() >= 3) {
						label3 = new JLabel (lstCartasJ1.get(2));
						if (lstCartasJ1.size() >= 4) {
							label4 = new JLabel (lstCartasJ1.get(3));
							if (lstCartasJ1.size() == 5) {
								label5 = new JLabel (lstCartasJ1.get(4));
							}
						}
					}
				}
			}
			else {
				label1 = new JLabel ("Você não possui nenhuma carta.");
			}
			break;
		case 2:
			if (lstCartasJ2.size()  >= 1) {
				label1 = new JLabel (lstCartasJ2.get(0));
				if (lstCartasJ2.size() >= 2) {
					label2 = new JLabel (lstCartasJ2.get(1));
					if (lstCartasJ2.size() >= 3) {
						label3 = new JLabel (lstCartasJ2.get(2));
						if (lstCartasJ2.size() >= 4) {
							label4 = new JLabel (lstCartasJ2.get(3));
							if (lstCartasJ2.size() == 5) {
								label5 = new JLabel (lstCartasJ2.get(4));
							}
						}
					}
				}
			}
			else {
				label1 = new JLabel ("Você não possui nenhuma carta.");
			}
			break;
		case 3:
			if (lstCartasJ3.size()  >= 1) {
				label1 = new JLabel (lstCartasJ3.get(0));
				if (lstCartasJ3.size() >= 2) {
					label2 = new JLabel (lstCartasJ3.get(1));
					if (lstCartasJ3.size() >= 3) {
						label3 = new JLabel (lstCartasJ3.get(2));
						if (lstCartasJ3.size() >= 4) {
							label4 = new JLabel (lstCartasJ3.get(3));
							if (lstCartasJ3.size() == 5) {
								label5 = new JLabel (lstCartasJ3.get(4));
							}
						}
					}
				}
			}
			else {
				label1 = new JLabel ("Você não possui nenhuma carta.");
			}
			break;
		case 4:
			if (lstCartasJ4.size()  >= 1) {
				label1 = new JLabel (lstCartasJ4.get(0));
				if (lstCartasJ4.size() >= 2) {
					label2 = new JLabel (lstCartasJ4.get(1));
					if (lstCartasJ4.size() >= 3) {
						label3 = new JLabel (lstCartasJ4.get(2));
						if (lstCartasJ4.size() >= 4) {
							label4 = new JLabel (lstCartasJ4.get(3));
							if (lstCartasJ4.size() == 5) {
								label5 = new JLabel (lstCartasJ4.get(4));
							}
						}
					}
				}
			}
			else {
				label1 = new JLabel ("Você não possui nenhuma carta.");
			}
			break;
		case 5:
			if (lstCartasJ5.size()  >= 1) {
				label1 = new JLabel (lstCartasJ5.get(0));
				if (lstCartasJ5.size() >= 2) {
					label2 = new JLabel (lstCartasJ5.get(1));
					if (lstCartasJ5.size() >= 3) {
						label3 = new JLabel (lstCartasJ5.get(2));
						if (lstCartasJ5.size() >= 4) {
							label4 = new JLabel (lstCartasJ5.get(3));
							if (lstCartasJ5.size() == 5) {
								label5 = new JLabel (lstCartasJ5.get(4));
							}
						}
					}
				}
			}
			else {
				label1 = new JLabel ("Você não possui nenhuma carta.");
			}
			break;
		case 6:
			if (lstCartasJ6.size()  >= 1) {
				label1 = new JLabel (lstCartasJ6.get(0));
				if (lstCartasJ6.size() >= 2) {
					label2 = new JLabel (lstCartasJ6.get(1));
					if (lstCartasJ6.size() >= 3) {
						label3 = new JLabel (lstCartasJ6.get(2));
						if (lstCartasJ6.size() >= 4) {
							label4 = new JLabel (lstCartasJ6.get(3));
							if (lstCartasJ6.size() == 5) {
								label5 = new JLabel (lstCartasJ6.get(4));
							}
						}
					}
				}
			}
			else {
				label1 = new JLabel ("Você não possui nenhuma carta.");
			}
			break;		
		}
		if (label1 != null)
			pane.add(label1);
		if (label2 != null)
			pane.add(label2);
		if (label3 != null)
			pane.add(label3);
		if (label4 != null)
			pane.add(label4);
		if (label5 != null)
			pane.add(label5);
		
		pane.setVisible(true);
		j.add(pane);
		
		j.pack();
		j.setLocationRelativeTo(null);
		j.setVisible(true);
	}
}


