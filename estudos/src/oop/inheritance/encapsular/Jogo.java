package oop.inheritance.encapsular;

import oop.inheritance.Heroi;
import oop.inheritance.Monstro;

public class Jogo {

	public static void main(String[] args) {
		Monstro mosntro = new Monstro(10, 20);

		Heroi heroi = new Heroi(10, 19);	
		
		System.out.println("mosntro vida: " + mosntro.vida);
		System.out.println("heroi vida: " + heroi.vida);
		
		heroi.atacar(mosntro);
		mosntro.atacar(heroi);
		
		System.out.println("mosntro vida: " + mosntro.vida);
		System.out.println("heroi vida: " + heroi.vida);
	}
}
