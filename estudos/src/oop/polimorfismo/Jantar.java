package oop.polimorfismo;

public class Jantar {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(100);
		
		Bolo b1 = new Bolo(2.0);
		Sorvete s1 = new Sorvete(1.0);
		Hamburguer h1 = new Hamburguer(0.850);

		System.out.println(p1.getPeso());
		
		p1.comer(b1);
		p1.comer(h1);
		p1.comer(s1);
		
		System.out.println(p1.getPeso());
	}
}
