package oop.inheritance.dasafio;

public class Carro {

	int velocidade = 0;
	
	void acelerar() {
		velocidade += 5;
	}
	
	void freiar() {
			
		if (velocidade - 5 < 0){
			velocidade = 0;
		}else {
			velocidade -= 5;
		}
	}
}
