package oop.inheritance.dasafio;

public class Carro {

	private final int VELOCIDADE_MAXIMA;
	public int velocidade = 0;
	private int delta = 20;
	
	Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar() {
		if (velocidade + this.getDelta() > VELOCIDADE_MAXIMA) {
			velocidade = VELOCIDADE_MAXIMA;
		} else {
			velocidade += this.getDelta();
		}
	}
	
	public void freiar() {
			
		if (velocidade - 5 < 0){
			velocidade = 0;
		}else {
			velocidade -= 5;
		}
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
}
