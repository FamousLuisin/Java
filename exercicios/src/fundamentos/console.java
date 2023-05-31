package fundamentos;

import java.util.Scanner;

public class console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" Dia\n");
		
		System.out.println("Bom dia");
		
		System.out.printf("Megasena: %d %d %d %d %d %d\n", 1, 2, 3, 4, 5, 6);
		System.out.printf("salario %.1f\n", 1300.5556);
		System.out.printf("Nome: %s", "Joao");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\n \nDigite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		entrada.close();
		
		System.out.printf("%s %s tem %d anos.", nome, sobrenome, idade);
	}
}
