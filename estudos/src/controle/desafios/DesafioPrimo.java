package controle.desafios;

import java.util.Scanner;

public class DesafioPrimo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num_divi = 0;
		int divisor = 1;
		
		System.out.print("Digite um valor: ");
		int valor = entrada.nextInt();
		
		while (divisor <= valor) {
			if (valor % divisor == 0) {
				num_divi++;
			}
			divisor++;
		}
		
		switch (num_divi) {
		case 2: {
			System.out.println("Primo");
			break;
		}
		default:
			System.out.println("Não primo");
			break;
		}
		
		entrada.close();
	}
}
