package Controle;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero, soma=0;
		
		do {
			System.out.println("Digite o valor");
			numero = entrada.nextInt();
			if (numero > 0) {
				soma += numero;
			}
			
			System.out.println("A soma agora: " + soma);
		} while (numero > 0);
		
		entrada.close();
	}
}
