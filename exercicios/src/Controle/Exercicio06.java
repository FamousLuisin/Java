package Controle;

import java.util.Random;
import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int sorteado, tentativas = 10;		
		int numero;
		
		Random numeroAleatorio = new Random();
		
		sorteado = numeroAleatorio.nextInt(101);
		System.out.println(sorteado);
		
		do {
			System.out.printf("Tentativa numero: %d\n", tentativas);
			
			System.out.println("Digite um numero: ");
			numero = entrada.nextInt();
			
			if (numero > sorteado) {
				System.out.println("Numero Sorteado menor");
			}
			else if(numero < sorteado){
				System.out.println("Numero sorteado maior");
			}
			
			tentativas -= 1;
			
		} while (numero != sorteado && tentativas != 0);
		
		if (numero == sorteado) {
			System.out.println("Acertou");
		}
		else {
			System.out.println("Errou");
		}
		
		entrada.close();
	}
}
