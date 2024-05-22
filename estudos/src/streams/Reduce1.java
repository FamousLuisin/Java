package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		BinaryOperator<Integer> somar = (total, n) -> total + n;
		
		// Se não passar um valor inicial ele retorna um Optional
		Integer total1 = nums.stream().reduce(somar).get();
		System.out.println(total1);
		
		// Caso pase um valor inicial, independente da situação ele retorna um valor
		// No paralelo stream, ele soma o valor 100 para cada chamada
		Integer total2 = nums.parallelStream().reduce(100, somar);
		System.out.println(total2);
		
		// Caso pase um valor inicial, independente da situação ele retorna um valor
		Integer total3 = nums.stream().reduce(100, somar);
		System.out.println(total3);
		
		
		// Resultado foi um Optional e por isso usando métodos do Optional
		nums.stream()
			.filter(n -> n > 5)
			.reduce(somar)
			.ifPresent(System.out::println);
		
	}
}
