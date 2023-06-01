package Controle;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int contador=0;
		int divisor=1;
		
		System.out.println("Digite um numero: ");
		int numero = entrada.nextInt();
		
		entrada.close();
		
		for (divisor = 1; divisor <= numero; divisor++) {
			if (numero % divisor == 0) {
				contador += 1;
			}
		}
		switch (contador) {
			case 2:
				System.out.println("Primo");
				break;

			default:
				System.out.println("Nao primo");
				break;
		}
		
	}
}
