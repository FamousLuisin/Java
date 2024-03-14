package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		//String por inferencia
		var nome = "Pedro";
		var sobrenome = "Silva";
		var salario = 5_500.581;
		System.out.println(nome.toUpperCase()); 
		System.out.println("nome: " + nome + "\nSobrenome: " + sobrenome); 
				
		//printf = print formatado
		//%.2f = arredonda um valor
		System.out.printf("nome: %s %s ganha %.2f \n", nome, sobrenome, salario);
		
		//Instancia o Scanner
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		nome = entrada.nextLine();
		
		System.out.println("Digite seu sobrenome: ");
		sobrenome = entrada.nextLine();
		
		System.out.println("Digite seu idade: ");
		int idade = entrada.nextInt();
		
		//Tirar o buffer de memoria antes do proximo nextLine
		entrada.nextLine();
		
		System.out.println("Qual seu Carro? ");
		String carro = entrada.nextLine();
		
		System.out.printf("%s %s tem %d anos e dirige um %s \n", nome, sobrenome, idade, carro);
		entrada.close();
	}
}
