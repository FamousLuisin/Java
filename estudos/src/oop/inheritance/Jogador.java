package oop.inheritance;

public class Jogador {

	int x;
	int y;
	int vida = 100;
	
	boolean atacar(Jogador oponente) {
		int deltaX = Math.abs(this.x - oponente.x);
		int deltaY = Math.abs(this.y - oponente.y);
		int dano = 10;
		
		if (deltaX == 0 && deltaY ==1) {
			oponente.vida -= dano;
			return true;
		} else if(deltaX == 1 && deltaY == 0) {
			oponente.vida -= dano;
			return true;
		}
		
		return false;
	}
	
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
