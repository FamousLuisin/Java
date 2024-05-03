package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {
		// Não recebe nada e devolve algo (Pode colocar um generico dentro de outro)
		// Nesse caso temos um supplier retornando uma lista
		Supplier<List<String>> lista = () -> Arrays.asList("Ana", "Bia", "Lia", "Gui");
		
		System.out.println(lista.get());
	}
}
