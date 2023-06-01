package Controle;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Nota 1: ");
		double nota1 = entrada.nextDouble();
		
		System.out.println("Nota 2: ");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if (media >= 7) {
			System.out.println("Aprovado");
		}
		else if(media >= 4){
			System.out.println("Recuperacao");
		}
		else {
			System.out.println("Reprovado");
		}
		
		entrada.close();
	}
}
