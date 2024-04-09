package collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoSet {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// Set não aceita valores iguais
		// Warning: Não é recomendado usar mais de um tipo em conjuntos
		// Ele converte os tipos primitios para seus parentes
		HashSet conjunto = new HashSet();
		
		// Adicionar valor
		conjunto.add(1.2); 		// double > Double
		conjunto.add(true); 	// boolena > Boolean
		conjunto.add("Teste"); 	// String
		conjunto.add(1); 		// Interger
		conjunto.add('c'); 		// char > Char
		
		System.out.println("Tamanho do conjunto: " + conjunto.size());
		
		// Não aceita valores iguais (Não acontece erro porem não add também)
		conjunto.add("Teste");
		System.out.println("Tamanho do conjunto: " + conjunto.size());
		
		System.out.println();
		
		//Remover elementos
		System.out.println("Remover valor que não existe: " + conjunto.remove("teste"));
		System.out.println("Remover valor que existe: " + conjunto.remove("Teste"));
		System.out.println("Tamanho do conjunto: " + conjunto.size());
		
		System.out.println();
		
		// Verificar se contem
		System.out.println("Elemento que o conjunto não contem: " + conjunto.contains(1.0));
		System.out.println("Elemento que o conjunto contem: " + conjunto.contains(1));
		
		//Mostrar o set
		System.out.println("Set conjunto: " + conjunto);
		
		System.out.println("===============================");
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println("Set nums: " + nums);
		
		
		// conjunto.addAll(nums); // União
		// conjunto.retainAll(nums); // Interceção
		// conjunto.clear(); // Limpar
		System.out.println(conjunto);
		
		
	}
}
