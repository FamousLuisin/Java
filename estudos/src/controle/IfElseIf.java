package controle;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite sua nota: ");
		double nota = entrada.nextDouble();
		
		if (nota > 10 || nota < 0) {
			System.out.println("Nota invalida");
		}else if(nota > 9) {
			System.out.println("Conceito A");
		}else if(nota > 7) {
			System.out.println("Conceito B");
		}else if(nota > 5) {
			System.out.println("Conceito C");
		}else {
			System.out.println("Conceito D");
		}
		
		System.out.println("FIM!");
		
		entrada.close();
	}
}
