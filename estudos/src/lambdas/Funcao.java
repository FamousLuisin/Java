package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		// IMPORTANTE
		// Recebe um tipo e retorna outro tipo, ou até mesmo o mesmo tipo
		Function<Integer, String> imparPar = numero -> numero % 2 == 0 ? "Par" : "Impar";
		
		Function<String, String> resultado = valor -> "O resultado é: " + valor;
		
		Function<String, String> empolgado = valor -> valor + "!!!";
		
		// apply = receita um argumento e retorna um resultado
		System.out.println(imparPar.apply(33));
	
		// Chama uma função e então chama outra função (andThen)
		// Uma função faz um pequeno processamento e chama outra para fazer outro processamento
		String resultadoFinal = imparPar.andThen(empolgado).andThen(resultado).apply(32);
		
		System.out.println(resultadoFinal);
	}
}
