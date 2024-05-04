package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadoBinario {

	public static void main(String[] args) {
		// Operador binario, recebe um parametro e retorna um valor
		BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
		
		// Operado Binario tipo função (recebe dois valores e retorna um outro valor)
		BiFunction<Double, Double, String> resultado = (n1, n2) -> {
			double notaFinal = (n1 + n2) / 2;
			return notaFinal >= 7 ? "Aprovado" : "Reprovado";
		};
		
		Function<Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Reprovado";
		
		System.out.println("media: " + media.apply(8.0, 10.0));
		System.out.println("Conceito: " + media.andThen(conceito).apply(8.0, 10.0));
		System.out.println("Resultado: " + resultado.apply(8.0, 10.0));
	}
}
