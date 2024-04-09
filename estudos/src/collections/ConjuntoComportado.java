package collections;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
	
	public static void main(String[] args) {
		// Conjunto de dados do tipo String(Comportado / Dados homogeneos)
		// Evitar usar tipos diferentes no mesmo conjunto(Dados heterogeneos)
		// Set<String> lista = new HashSet<>();
		
		// Set ordenado -> Vem do SortedSet
		Set<String> lista = new TreeSet<>();
		
		// lista.add(5); // Não aceita valores diferente do tipo indicado
		lista.add("B...");
		lista.add("C...");
		lista.add("A...");
		
		System.out.println("Possiveis palavrões reduzidos: " );
		for (String string : lista) {
			System.out.println(string);
		}
	}
}
