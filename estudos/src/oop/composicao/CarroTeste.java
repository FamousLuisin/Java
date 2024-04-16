package oop.composicao;

public class CarroTeste {

	public static void main(String[] args) {
		Carro c1 = new Carro();
		System.out.println("ligado? " + c1.estaLigado());
		
		c1.ligar();
		System.out.println("ligado? " + c1.estaLigado());
		System.out.println("giros: " + c1.motor.giros());
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		
		System.out.println("giros: " + c1.motor.giros());
		
		c1.freiar();
		c1.freiar();
		c1.freiar();
		c1.freiar();

		
		System.out.println("giros: " + c1.motor.giros());
	}
}
