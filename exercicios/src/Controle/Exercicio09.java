package Controle;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um valor inicial");
		numero = entrada.nextInt();
		
		int maior = numero;
		
		for(int i=1; i <= 9; i++) {
			System.out.println("Digite um valor");
			numero = entrada.nextInt();
			if(numero > maior) {
				maior = numero;
			}
		}
		
		System.out.println(maior);
		
		entrada.close();
	}
}
