package oop.inheritance;

public class Monstro extends Jogador{

	// Construtor padrão do monstro chamando construtor novo do Jogador
	public Monstro(){
		super(0, 0);
	}
	
	public Monstro(int x, int y){
		super(x, y);
	}
}
