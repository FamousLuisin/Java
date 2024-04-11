package collections;

import java.util.LinkedList;
import java.util.Queue;

public class ConjuntoFila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// Adicionar Elementos 
		fila.add("Ana"); // Se a fila tiver restrição ele retornar um erro / excessão
		fila.offer("Bia"); // Se a fila tiver restrição ele retornar (verdadeira se inseriu ou false se nn inseriu)
		fila.offer("Noc"); 
		fila.add("Lulu"); 
		fila.offer("Maria"); 
		
		// Apenas lê o primeiro elemento da fila sem remover
		System.out.println(fila.peek()); // Se fila vazia retorna nulo
		System.out.println(fila.element()); // Se fila vazia retorna um erro / excessão
		
		System.out.println();
		
		// Chama / mostra o primeiro elemento da fila e logo em seguida o remove
		System.out.println(fila.poll());
		System.out.println(fila.poll()); // Retorna nulo se não tiver elementos na fila
		System.out.println(fila.remove()); // retorna excessão / erro se não tiver elementos
		System.out.println(fila.poll());
		
		System.out.println(fila.peek()); // Mostrando o novo primeiro elemento da fila
		
		// Todos os outros métodos das coleções
		// fila.clear(); // Limpar
		// fila.size(); // Tamanho
		// fila.isEmpty(); // Verificar se esta vazia
		
		// OBS: pode usar foreach > ele mostrará os elemntos conforme ordem de saida
	}
}
