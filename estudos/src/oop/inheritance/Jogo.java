package oop.inheritance;

public class Jogo {

	public static void main(String[] args) {
		Monstro mosntro = new Monstro();
		mosntro.x = 10;
		mosntro.y = 20;
		
		Heroi heroi = new Heroi();
		heroi.x = 10;
		heroi.y = 19;	
		
		System.out.println("mosntro vida: " + mosntro.vida);
		System.out.println("heroi vida: " + heroi.vida);
		
		heroi.atacar(mosntro);
		mosntro.atacar(heroi);
		
		System.out.println("mosntro vida: " + mosntro.vida);
		System.out.println("heroi vida: " + heroi.vida);
	}
}
