package oop.encapsulamento;

public class Pessoa {

	private int idade;
	
	public Pessoa(int idade) {
		this.setIdade(idade);
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade); // Pega o valor absoluto / módulo do valor entregue
		if (novaIdade >= 0 && novaIdade <= 120) {
			this.idade = novaIdade;
		}
	}
	
	public String toString() {
		return "Minha idade é: " + this.idade;
	}
}
