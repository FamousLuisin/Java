package Controle;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int numero = entrada.nextInt();
		
		if (numero <= 10 && numero >= 0) {
			if (numero % 2 == 0) {
				System.out.println("Esse numero é par e esta entra 0 e 10");
			}
			else {
				System.out.println("Ele esta entre 0 e 10 mas nao e par");
			}
		}
		else {
			System.out.println("Ele nao esta dentro do padrao");
		}
		
		entrada.close();
	}
}
