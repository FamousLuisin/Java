package oop.inheritance;

public class Monstro extends Jogador{

	// Construtor padrão do monstro chamando construtor novo do Jogador
	Monstro(){
		super(0, 0);
	}
	
	Monstro(int x, int y){
		super(x, y);
	}
}
