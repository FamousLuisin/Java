package oop.inheritance.encapsular;

import oop.inheritance.dasafio.Mustang;
import oop.inheritance.dasafio.Porsche;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("======Porsche======");
		Porsche p1 = new Porsche();
		System.out.println("Inicial: " + p1.velocidade);
		p1.acelerar();
		p1.acelerar();
		p1.acelerar();
		System.out.println("Depois de acelerar: " + p1.velocidade);
		p1.freiar();
		p1.freiar();
		p1.freiar();
		System.out.println("Depois de freiar: " + p1.velocidade);
		
		System.out.println("======Mustang======");
		Mustang m1 = new Mustang();
		System.out.println("Inicial: " + m1.velocidade);
		m1.acelerar();
		m1.acelerar();
		m1.acelerar();
		System.out.println("Depois de acelerar: " + m1.velocidade);
		m1.freiar();
		m1.freiar();
		m1.freiar();
		System.out.println("Depois de freiar: " + m1.velocidade);
	}
}
