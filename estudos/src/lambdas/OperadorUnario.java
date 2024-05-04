package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

	public static void main(String[] args) {
		// Usada com maior frequencia
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		//maisDois -> vezesDois -> aoQuadrado
		int resultado = maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(2);
		
		//maisDois -> aoQuadrado -> vezesDois
		int resultado2 = maisDois.andThen(aoQuadrado).andThen(vezesDois).apply(2);
		
		//maisDois -> vezesDois -> aoQuadrado
		int resultado3 = aoQuadrado.compose(vezesDois).compose(maisDois).apply(2);
		
		System.out.println("andThen: " + resultado);
		System.out.println("andThen: " + resultado2);
		System.out.println("compose: " + resultado3);
	}
}
