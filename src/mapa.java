package Map;

//import java.util.Observable;
//import java.util.Observer;

import javax.swing.*;

import Controle.Subject;


@SuppressWarnings("serial")
public class mapa extends JFrame /*implements Observer*/ {
	
//	private int totalPecas;
//	private int cor;
//	private int pecasGastar;
	
	public final int WIDTH = 1028;
	public final int HEIGHT = 795;
	
//	private static int observerIDTracker = 0;
	
//	private int observerID;
	
//	private Subject Jogador;
	
	public mapa (/*Subject Jogador*/){
		
//		this.Jogador = Jogador;
//		this.observerID = ++observerIDTracker;
//		Jogador.register(this);
		
		ImageIcon img = new ImageIcon("Icon.png");
		this.setSize(WIDTH, HEIGHT);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		setTitle("WAR");
		this.setIconImage(img.getImage());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		drawMap m = new drawMap();
		getContentPane().add(m);
		setVisible(true);
	
	}
	
//	@Override
//	public void update(int cor, int totalPecas, int pecasGastar) {
//		// TODO Auto-generated method stub
//		this.cor = cor;
//		this.totalPecas = totalPecas;
//		this.pecasGastar = pecasGastar;
//		
//	}
	
}