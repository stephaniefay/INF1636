package Controle;

import java.util.Comparator;

public class MyComparator implements Comparator<Jogador> {
	
	@Override
	public int compare(Jogador o1, Jogador o2) {
		if (o1.getVez() > o2.getVez()) {
        	return 1;
    	} 
    	else if (o1.getVez() < o2.getVez()) {
        	return -1;
    	}
    	return 0;
	}
}
