package Cartas;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import Controle.Jogador;


@SuppressWarnings("serial")
public class Objetivo extends JFrame {

	public final int WIDTH = 340;
	public final int HEIGHT = 570;
	
	public Objetivo (Jogador play, String [] Objetivos) {
		
		ImageIcon img = new ImageIcon("Icon.png");
		this.setSize(WIDTH, HEIGHT);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setIconImage(img.getImage());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setUndecorated(true);
		this.setBackground(new Color(0,0,0,0));
		this.setAlwaysOnTop(true);
		
		ObjetivosB m = new ObjetivosB(play, Objetivos);
		getContentPane().add(m);
		setVisible(true);
	
	}
	
	
}
