package classes.desafio;

public class Jantar {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Luiza", 70);
		Comida c1 = new Comida("Frango", 0.475);
		Comida c2 = new Comida("Arroz", 0.825);
		
		System.out.println(p1.nome + " tem " + p1.peso);
		
		p1.comer(c1);
		p1.comer(c2);
		
		System.out.println(p1.nome + " tem " + p1.peso);
	}
}
