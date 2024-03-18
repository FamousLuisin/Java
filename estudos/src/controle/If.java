package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a média: ");
		double nota = entrada.nextDouble();
		
		if (nota >= 7) {
			System.out.println("Aprovado");
		}
		
		if (nota <= 7 && nota >= 5) {
			System.out.println("Recupreação");
		}
		
		if (nota < 5) {
			System.out.println("Reprovado");
		}
		
		entrada.close();
	}
}
