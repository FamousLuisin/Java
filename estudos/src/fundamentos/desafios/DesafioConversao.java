package fundamentos.desafios;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Primeiro salario: ");
		String salario1 = entrada.nextLine().replace(',', '.');
		
		System.out.println("Segundo salario: ");
		String salario2 = entrada.nextLine().replace(',', '.');
		
		System.out.println("Terceiro salario: ");
		String salario3 = entrada.nextLine().replace(',', '.');
		
		double total = Double.parseDouble(salario1) + Double.parseDouble(salario2) + Double.parseDouble(salario3);
		double media = total / 3;
		
		System.out.println("\nMédia salarial é: " + media);
		entrada.close();	
	}
}
