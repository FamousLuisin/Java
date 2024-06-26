package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");
		
		System.out.println("----- Tradicional -----");
		for (String nome : aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\n----- Lambda #01 -----");
		aprovados.forEach(nome -> System.out.println(nome + "!!!"));
		
		System.out.println("\n----- Method Refrence #01 -----");
		aprovados.forEach(System.out::println);
		
		System.out.println("\n----- Lambda #03 -----");
		aprovados.forEach(nome -> meuImprimir(nome));
		
		System.out.println("\n----- Method Refrence #02 -----");
		aprovados.forEach(Foreach::meuImprimir);
	}
	
	static void meuImprimir(String nome) {
		System.out.println("Meu nome é " + nome);
	}
}
