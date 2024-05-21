package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
	
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		Consumer<Integer> println = System.out::println;
		
		Function<Integer, String> converterBinario = numero -> {
			return Integer.toBinaryString(numero);
		};
		
		Function<String, String> inverterString = string -> {
			String newString = "";
			for (int i = string.length() - 1; i >= 0; i--) {
				newString = newString + string.charAt(i);
			}
			return newString;
		};
		
		// Outra forma mais inteligente de inverter strings
		UnaryOperator<String> inverter = string -> new StringBuilder(string).reverse().toString();
		
		Function<String, Integer> converterInteiro = string -> {
			return Integer.parseInt(string, 2);
		};
		
		// Meu jeito
		nums.stream()
			.map(converterBinario)
			.map(inverterString)
			.map(converterInteiro)
			.forEach(println);
		
		System.out.println();
		
		// Jeito mais inteligente
		nums.stream()
			.map(Integer::toBinaryString)
			.map(inverter)
			.map(converterInteiro)
			.forEach(println);
	}
}
