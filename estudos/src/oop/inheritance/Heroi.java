package oop.inheritance;

public class Heroi extends Jogador {
	
	// Chamar construtor padrão, caso não exista causa erro
	Heroi(){
		super();
	}
	
	// Chamar construtor novo
	Heroi(int x, int y){
		super(x, y);
	}

	boolean atacar(Jogador oponente) {
		boolean atk1 = super.atacar(oponente);
		boolean atk2 = super.atacar(oponente);
		return atk1 || atk2;
	}
}
