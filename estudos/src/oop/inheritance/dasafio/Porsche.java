package oop.inheritance.dasafio;

public class Porsche extends Carro {
	
	public Porsche(){
		super(300);
		// Alterar valor de delta
		super.delta = 50;
	}

	// Chamar a função acelerar do pai, pórem o delta esta nessa classe alterado
	// Nesse caso não é preciso nem sobreescrever a função acelerar
	
	@Override
	public void acelerar() {
		super.acelerar();
	}
}
