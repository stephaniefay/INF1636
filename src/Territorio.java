package Controle;

import java.awt.geom.GeneralPath;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class Territorio extends JComponent{

	private String Nome;
	private GeneralPath poligono;
	private int Jogador;
	private String CorJogador;
	public int qtdPecas;
	public List<String> Vizinhos = new ArrayList<String> ();
	static public List<Territorio> territorios;
	public int index;

	public Territorio(String nome, Ponto p[], float x, float y, int ind) {
		super();
		
		this.Nome = nome;
		
		GeneralPath gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);				
		
		gp.moveTo(p[0].get("x") + (x),p[0].get("y") + (y));

		for (int i = 1; i < p.length; i++) {
			gp.lineTo(p[i].get("x") + (x), p[i].get("y") + (y));
		}

		gp.closePath();
		
		this.poligono = gp;
		index = ind;
	}
	
	public Territorio() {
		// TODO Auto-generated constructor stub
	}

	public GeneralPath getPoligono() {
		return this.poligono;
	}
	
	public String retName () {
		return Nome;
	}
	
	public void preencheJogador (int j) {
		Jogador = j;
	}
	
	public void preencheCor (String j) {
		CorJogador = j;
	}
	
	public String retCorJogador () {
		return CorJogador;
	}
	
	public int retJogador() {
		return Jogador;
	}
	
	public void colocaVizinho (String v) {
		Vizinhos.add(v);
	}
	
	public boolean checaViz (String v) {
		
		for (String z : Vizinhos) {
			if (z == v)
				return true;
		}
		
		return false;
	}
	public List<String> lstVizinhos () {
		return Vizinhos;
	}
	
	public int attPecas (int flag) {
		@SuppressWarnings("unused")
		int aux;
		switch(flag) {
		case 0:
			qtdPecas++;
			return 0;
		
		case 1: 
			if ((aux = qtdPecas--) == 0) {
				JFrame j = new JFrame ();
				JOptionPane.showMessageDialog(j, "Você não pode ficar com zero unidades!", "Erro", JOptionPane.ERROR_MESSAGE);
				return -1;
			}
			else {
				qtdPecas--;
				return 0;
			}
		}
		return -1;
	}
	
	
	public int qtdPecas () {
		return qtdPecas;
	}
	
	public void preencheLista (List<Territorio> ter) {
		territorios = ter;
	}
	
	public List<Territorio> retLista () {
		return territorios;
	}
	
	public String qtdTerString () {
		return String.valueOf(qtdPecas);
	}
	
	public int retIndex () {
		return index;
	}
	
	public void qtdPecas (int a) {
		qtdPecas = a;
	}
}
