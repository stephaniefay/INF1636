package Controle;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class Jogador /*implements Subject*/  {
	int vez;
	int cor;
	int numMax;
	List<String> Territorio = new ArrayList<String>();
	List<Observer> observers = new ArrayList<Observer>();
	int pecasGastar;
	int totalPecas = 0;
	static List<Jogador> players;
	int objetivo;
	
//	public void setCor(int novaCor){
//		if(this.cor != novaCor){
//			this.cor = novaCor;
//			notifyObserver();
//		}
//	}
	
//	public void setTotalPecas(int novoTotalPecas){
//		if(this.totalPecas != novoTotalPecas){
//			this.totalPecas = novoTotalPecas;
//			notifyObserver();
//		}
//	}
	
//	public void setPecasGastar(int novoPecasGastar){
//		if(this.pecasGastar != novoPecasGastar){
//			this.pecasGastar = novoPecasGastar;
//			notifyObserver();
//		}
//	}
	
//	public void register(Observer newObserver){
//		observers.add(newObserver);
//	}
	
//	public void unregister(Observer deleteObserver){
//		int observerIndex = observers.indexOf(deleteObserver);
//		System.out.println("Observador " + (observerIndex+1) + " deletado");
//		observers.remove(deleteObserver);
//	}
	
//	public void notifyObserver(){
//		for(Observer observer: this.observers){
//			observer.update(cor, totalPecas, pecasGastar);
//		}
//	}
	
	public Color retBackground () {
		if (cor == 0) 
			return new Color (255, 0, 0);
		else if (cor == 1)
			return new Color (255, 102, 0);
		else if (cor == 2)
			return new Color (102, 204, 255);
		else if (cor == 3)
			return new Color (51, 204, 51);
		else if (cor == 4)
			return Color.white;
		else if (cor == 5)
			return new Color (63, 63, 63);
		return null;
	}
	
	public String getCor () {
		if		( cor == 0 )
			return "<font color='#FF0000'>Vermelho</font>";
		else if ( cor == 1 )
			return "<font color='#FF6600'>Laranja</font>";
		else if ( cor == 2 )
			return "<font color='#66CCFF'>Azul</font>";
		else if ( cor == 3 )
			return "<font color='#33CC33'>Verde</font>";
		else if ( cor == 4 )
			return "<font color='#FFFFFF'>Branco</font>";
		else if ( cor == 5 )
			return "<font color='#000000'>Preto</font>";
		return "Invalido";
	}
	
	public int getVez () {
		return vez;
	}
	
	public Jogador (int x, int y, int z) {
		cor = x;
		vez = y;
		numMax = z;
	}

	public Jogador() {
		// TODO Auto-generated constructor stub
	}

	public void attVez (int i) {
		vez = i;
	}
	
	public int getMax () {
		return numMax;
	}
	
	public void botaLista (String info) {
		Territorio.add(info);
		pecasGastar = Territorio.size()/2;
	}
	
	public void retLista (String info) {
		for (String m : Territorio) {
			if (m == info) {
				Territorio.remove(m);
				break;
			}
		}
	}
	
	public int retPecas () {
		return pecasGastar;
	}
	
	public void dimPecas (int i) {
		pecasGastar = i;
	}
	
	public List<String> retLista () {
		return Territorio;
	}
	
	public void attPecas ( ) {
		pecasGastar = Territorio.size()/2;
	}
	
	public void mexePecas (int flag) {
		switch(flag){
		case 0:
			//soma
			totalPecas++;
			break;
		case 1:
			//sub
			totalPecas--;
			break;
		}
	}

	public void preenchePlayers (List<Jogador> meh) {
		players = meh;
	}
	
	public List<Jogador> retListaJ () {
		return players;
	}
	
	public void colocaObjetivo (int i) {
		objetivo = i;
	}
	
	public int retObjetivo () {
		return objetivo;
	}
	
}
