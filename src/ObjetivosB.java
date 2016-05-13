package Cartas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Window;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Controle.Jogador;

@SuppressWarnings("serial")
public class ObjetivosB extends JPanel {
	public BufferedImage  fundoObjetivo;
	private ImageIcon ButtonFechar = new ImageIcon ("Button.png");
	
	
	public ObjetivosB ( Jogador play, String [] Objetivos ) {
		this.setLayout(new BorderLayout());
		this.setOpaque(false);
		try {
			fundoObjetivo = ImageIO.read(new File("objetivo.png"));
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
		
		JLabel label1 = new JLabel ("<html><p style='width:220px' align='center'>" + Objetivos[play.retObjetivo()] + "</p></html>");
		label1.setHorizontalAlignment(JLabel.CENTER);
		label1.setFont(new Font("Verdana",Font.PLAIN, 20));
		label1.setForeground(Color.black);
		label1.setVisible(true);
		add(label1);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(fundoObjetivo, 0, 0, 340, 525, null);
	}
	

}
