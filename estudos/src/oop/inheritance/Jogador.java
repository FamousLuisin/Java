package oop.inheritance;

public class Jogador {

	int x;
	int y;
	
	boolean andar(Direction direction) {
		
		switch (direction) {
		case NORTE: 
			y++;
			break;
		
		case SUL: 
			y--;
			break;
			
		case LESTE: 
			x++;
			break;
		
		case OESTE: 
			x--;
			break;
		}
		
		return true;
	}
}
