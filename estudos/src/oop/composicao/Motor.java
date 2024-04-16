package oop.composicao;

public class Motor {

	Carro carro;
	boolean ligado = false;
	double fatorInjecao = 1;
	
	Motor(Carro carro){
		this.carro = carro;
	}
	
	int giros() {
		if(!this.ligado) {
			return 0;
		} else {
			return (int) Math.round(this.fatorInjecao * 3000);
		}
	}
}
