package oop.inheritance.dasafio;

public class Carro {

	final int VELOCIDADE_MAXIMA;
	int velocidade = 0;
	int delta = 20;
	
	Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	void acelerar() {
		if (velocidade + delta > VELOCIDADE_MAXIMA) {
			velocidade = VELOCIDADE_MAXIMA;
		} else {
			velocidade += delta;
		}
	}
	
	void freiar() {
			
		if (velocidade - 5 < 0){
			velocidade = 0;
		}else {
			velocidade -= 5;
		}
	}
}
