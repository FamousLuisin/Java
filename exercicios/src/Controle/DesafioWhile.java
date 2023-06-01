package Controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double nota, soma=0, numeroNotas=0;
		
		do {
			System.out.println("Digite as notas em um intervalo de [0 a 10]: Caso queira terminar digite[-1]");
			nota = entrada.nextDouble();
			
			if (nota >= 0 && nota <= 10) {
				soma += nota;
				numeroNotas++;
			}
			else if(nota != -1){
				System.out.println("Nota invalida");
			}
			
		} while (nota != -1);
		
		System.out.println("Media do aluno: " + soma / numeroNotas);
		
		entrada.close();
		
	}
}
