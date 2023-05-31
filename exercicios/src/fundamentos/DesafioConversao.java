package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro salario: ");
		String salario1 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Digite o primeiro salario: ");
		String salario2 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Digite o primeiro salario: ");
		String salario3 = entrada.nextLine().replace(",", ".");
		
		entrada.close();
		
		double soma = Double.parseDouble(salario3) + Double.parseDouble(salario2) + Double.parseDouble(salario1);
		double media = soma / 3;
		
		System.out.println("A media é: " + media);
	}
}
