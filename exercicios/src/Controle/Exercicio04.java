package Controle;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int contador=0;
		int divisor=1;
		
		System.out.println("Digite um numero: ");
		int numero = entrada.nextInt();
		
		while (divisor <= numero) {
			if (numero % divisor == 0) {
				contador += 1;
			}
			divisor += 1;
		}
		
		if (contador > 2) {
			System.out.println("Nao primo");
		}
		else {
			System.out.println("Primo");
		}
		
		entrada.close();
			
	}
	
}
