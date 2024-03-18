package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite uma palavra: ");
		String palavra = entrada.next();
		
		while (!palavra.equalsIgnoreCase("sair")) {			
			System.out.println("Digite outra palavra: ");
			palavra = entrada.next();

		}
		
		System.out.println("Saindo do sistema");
		
		entrada.close();
	}
}
