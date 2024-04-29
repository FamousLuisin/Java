package oop.inheritance.dasafio;

public class Carro {

	private final int VELOCIDADE_MAXIMA;
	public int velocidade = 0;
	protected int delta = 20;
	
	Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar() {
		if (velocidade + delta > VELOCIDADE_MAXIMA) {
			velocidade = VELOCIDADE_MAXIMA;
		} else {
			velocidade += delta;
		}
	}
	
	public void freiar() {
			
		if (velocidade - 5 < 0){
			velocidade = 0;
		}else {
			velocidade -= 5;
		}
	}
}
