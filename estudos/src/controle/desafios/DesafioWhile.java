package controle.desafios;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		int validas = 0;
		double total = 0;
		double nota;
		
		Scanner entrada = new Scanner(System.in);
		
		do {
			System.out.println("Nota: ");
			nota = entrada.nextDouble();
			
			if (nota < 0 || nota > 10) {
				if (nota != -1) {
					System.out.println("Nota invalida");
				}
			}
			else {
				total += nota;
				validas++;
			}
			
		} while (nota != -1);
		
		double media = total / validas;
		System.out.println("A média da turma é: " + media);
		
		entrada.close();
	}
}
