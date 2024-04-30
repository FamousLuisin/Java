package oop.inheritance.dasafio;

public class Porsche extends Carro implements Esportivo{
	
	private boolean ligarTurbo;
	
	public Porsche(){
		super(300);
		// Alterar valor de delta
		super.setDelta(50);
	}

	// Chamar a função acelerar do pai, pórem o delta esta nessa classe alterado
	// Nesse caso não é preciso nem sobreescrever a função acelerar
	
	@Override
	public void acelerar() {
		super.acelerar();
	}

	@Override
	public void ligarTurbo() {
		this.ligarTurbo = true;
	}

	@Override
	public void desligarTurbo() {
		this.ligarTurbo = false;
	}
	
	@Override
	public int getDelta() {
		if(this.ligarTurbo) {
			return 60;
		} else {
			return 50;
		}
	}
}
