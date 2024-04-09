package arrays;

import java.util.Arrays;

public class Exercicio {
	
	public static void main(String[] args) {
		// Criar um aray do tipo double de 3 posições
		// Ele ja inicializa com um valor nulo nesse caso 0.0
		System.out.println("========= A ==========");
		double[] notasAlunosA = new double[4];
		System.out.println(Arrays.toString(notasAlunosA));
		
		// Percorrer o array e incremetar valor
		for (int i = 0; i<notasAlunosA.length; i++) {
			notasAlunosA[i] = i + 3;
			
		}
		
		System.out.println("======================");
		
		// Usar Arrays de utils para mostra a lista completa
		System.out.println(Arrays.toString(notasAlunosA));
		
		System.out.println("======================");
		
		// Sem o Arrays.toString()
		System.out.println(notasAlunosA);
		
		System.out.println("======================");
		
		// Percorrer o array para pegar valor
		double total = 0;
		for (int i = 0; i<notasAlunosA.length; i++) {
			total += notasAlunosA[i];
		}
		
		System.out.println("media A: " + total / notasAlunosA.length);
		
		
		
		System.out.println("========= B ==========");
		// Iniciar os valores de um array
		double[] notasAlunosB = {6.6, 7.9, 7.1, 8.9};
		
		total = 0;
		for (int i = 0; i < notasAlunosB.length; i++) {
			total += notasAlunosB[i];
		}
		
		System.out.println("media B: " + total / notasAlunosB.length);
	}
}
