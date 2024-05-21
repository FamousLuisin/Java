package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {
		Consumer<String> print = System.out::print;
		@SuppressWarnings("unused")
		Consumer<Integer> println = System.out::println;
		
		// Criar stream pelo método static Stream.of
		Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
		langs.forEach(print);
		
		// Criar através de um array
		String[] maisLangs = {"Python ", "Lisp ", "Perl ", "Go\n"};
		
		Stream.of(maisLangs).forEach(print);
		Arrays.stream(maisLangs).forEach(print);
		
		// Podemos passar valores dentro do metodo stream para onde vai iniciar e terminar
		// Nesse caso vai pegar o elemento 1 e ir até o 3 sem pegar ele (Pegando do lisp até o go)
		Arrays.stream(maisLangs, 1, 4).forEach(print);
		
		// Através das colections
		List<String> outrasLangs = Arrays.asList("C ", "Rust " , "PHP ", "Kotlin\n");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);
		
		// Stream "infinita" ou potencialmente infinita
		// Stream.generate(() -> "a\n").forEach(print);
		
		// Stream "infinita" ou potencialmente infinita gerando valores de numeros inteiros
		// Passa primeiro o valor inicial
		// Stream.iterate(0, n -> n + 1).forEach(println);
	}
}
