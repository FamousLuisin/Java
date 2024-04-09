package arrays.desafios;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite quantas notas terá: ");
		int n = entrada.nextInt();
		
		double[] notas = new double[n];
		
		for (int i = 0; i < notas.length ; i++) {
			System.out.print("Digite a nota: ");
			notas[i] = entrada.nextDouble();
		}
		
		double total = 0;
		
		for (double nota : notas) {
			total += nota;
		}
		
		double media = total / notas.length;
		
		System.out.println("Notas: " + Arrays.toString(notas));
		System.out.println("media: " + media);
		
		
		
		entrada.close();
	}
}
