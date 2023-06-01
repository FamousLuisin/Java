package Controle;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o ano: ");
		int ano = entrada.nextInt();
		
		boolean bissexto = ano % 4 == 0 && ano % 100 == 0 && ano % 400 == 0;
		
		
		if (bissexto) {
			System.out.println("ano bissexto");
		}
		else {
			System.out.println("Nao e ano bissexto");
		}
		
		entrada.close();
	}
}
