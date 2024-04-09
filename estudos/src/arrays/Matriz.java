package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Numero de alunos: ");
		int qnt_alunos = entrada.nextInt();
		
		System.out.println("Numero de notas: ");
		int qnt_notas = entrada.nextInt();
		
		//[[aluno0 notas],[aluno1 notas],[aluno2 notas]]
		double[][] notas = new double[qnt_alunos][qnt_notas];
		
		double soma = 0;
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Notas aluno: " + (i + 1));
			
			for (int j = 0; j < notas[i].length; j++) {
				System.out.print("Nota " + (j + 1) + ":" );
				notas[i][j] = entrada.nextDouble();
				soma += notas[i][j];
			}
			
			System.out.println();
		}
		
		for (double[] aluno : notas) {
			System.out.println(Arrays.toString(aluno));
		}
		
		System.out.println();
		
		double media = soma / (qnt_alunos * qnt_notas);
		System.out.println("média: " + media);
		System.out.println("Soma: " + soma);
		
		entrada.close();
	}
}
