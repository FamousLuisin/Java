package classes.desafio;

public class Pessoa {
	
	String nome;
	double peso;
	
	
	public Pessoa() {
	}
	
	public Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	
	void comer(Comida c) {
		if (c != null) {
			this.peso += c.peso;
		}
	}
}
