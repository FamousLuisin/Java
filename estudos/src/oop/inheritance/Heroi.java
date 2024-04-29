package oop.inheritance;

public class Heroi extends Jogador {
	
	// Chamar construtor padrão, caso não exista causa erro
	public Heroi(){
		super();
	}
	
	// Chamar construtor novo
	public Heroi(int x, int y){
		super(x, y);
	}

	public boolean atacar(Jogador oponente) {
		boolean atk1 = super.atacar(oponente);
		boolean atk2 = super.atacar(oponente);
		return atk1 || atk2;
	}
}
