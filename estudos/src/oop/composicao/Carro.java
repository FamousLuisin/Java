package oop.composicao;

public class Carro {

	// instanciar um motor na composição (dentro do carro)
	Motor motor;
	
	Carro(){
		// ta passando como parametro o próprio objeto carro
		this.motor = new Motor(this);
	}
	
	void acelerar() {
		if (this.motor.fatorInjecao < 2.5) {
			this.motor.fatorInjecao += 0.4;
		}
	}
	
	void freiar() {
		if (this.motor.fatorInjecao > 0.5) {
			this.motor.fatorInjecao -= 0.4;
		}
	}
	
	void ligar() {
		this.motor.ligado = true;
	}
	
	void desligar() {
		this.motor.ligado = false;
	}
	
	boolean estaLigado() {
		return this.motor.ligado;
	}
}
