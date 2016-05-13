package Map;

import java.awt.Color;

import javax.swing.*;

import Controle.Territorio;


@SuppressWarnings("serial")
public class Ataque extends JFrame{
	
	public final int WIDTH = 300;
	public final int HEIGHT = 279;
	
	public Ataque (Territorio t1, Territorio t2) {
		
		ImageIcon img = new ImageIcon("Icon.png");
		this.setSize(WIDTH, HEIGHT);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setIconImage(img.getImage());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setUndecorated(true);
		this.setBackground(new Color(0,0,0,0));
		this.setAlwaysOnTop(true);
		
		AtaqueB m = new AtaqueB(t1, t2);
		getContentPane().add(m);
		setVisible(true);
	
	}
	
}