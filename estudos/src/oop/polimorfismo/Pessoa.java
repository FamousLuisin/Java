package oop.polimorfismo;

public class Pessoa{

	private double peso;
	
	public Pessoa(double peso) {
		setPeso(peso);
	}
	
//	public void comer(Bolo bolo) {
//		this.peso += bolo.getPeso();
//	}
//	
//	public void comer(Sorvete sorvete) {
//		this.peso += sorvete.getPeso();
//	}
//	
//	public void comer(Hamburguer hamburguer) {
//		this.peso += hamburguer.getPeso();
//	}
	
	public void comer(Comida comida) {
		this.peso += comida.getPeso();
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if(peso >= 0) {
			this.peso = peso;
		}
	}
}
