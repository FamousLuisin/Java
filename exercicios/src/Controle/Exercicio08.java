package Controle;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite uma palavra: ");
		String palavra = entrada.next();
		
		char letras[] = palavra.toCharArray();
		
		for (int i = 0; i < palavra.length(); i++) {
			System.out.println(palavra.charAt(i));
		}
		
		for (int i = 0; i < letras.length; i++) {
			System.out.println(letras[i]);
		}
		
		entrada.close();
	}
}
