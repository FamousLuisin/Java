package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Map {

	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		
		List<String> marcas =  Arrays.asList("BMW ", "Audi ", "Porsche ");
		
		// Transforma a lista e uma stream usando biuld ->
		// Executa o map pegando cada marca e fazendo toUpperCase ->
		// Depois faz um foreach
		// Map sempre retorna o mesmo numero de dados
		marcas.stream().map(marca -> marca.toUpperCase()).forEach(print);
		
		System.out.println();
		
		// Usando composição "tradicional"
		for (String marca : marcas) {
			String texto = Utilitarios.maiuscula.andThen(Utilitarios.primeiraLetra).apply(marca);
			System.out.println(Utilitarios.gritar(texto));
		}
		
		// Usando composição com map
		marcas.stream()
			.map(Utilitarios.maiuscula)
			.map(Utilitarios.primeiraLetra)
			.map(Utilitarios::gritar)
			.forEach(print);
	}
}
