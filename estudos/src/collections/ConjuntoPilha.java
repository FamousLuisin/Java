package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ConjuntoPilha {

	public static void main(String[] args) {
		
		Deque<String> pilha = new ArrayDeque<String>();
		
		// Adicionar elementos
		pilha.add("Pequeno principe"); // Retorna verdadeiro ou false se conseguiu ou não adicionar
		pilha.push("O principe"); // Retorna uma excessão / erro se não conseguiu adicionar
		pilha.push("O Hobbit");
		
		// Mostrar o ultimo elemento adicionado
		System.out.println(pilha.peek()); // Se pilha vazia retorna nulo
		System.out.println(pilha.element()); // Se pilha vazia retorna excessão / erro
		
		System.out.println();
		
		// Chama / mostra o primeiro elemento da fila e logo em seguida o remove
		System.out.println(pilha.pop()); // retorna excessão / erro se não tiver elementos
		System.out.println(pilha.remove()); // retorna excessão / erro se não tiver elementos
		System.out.println(pilha.poll()); // Retorna nulo se não tiver elementos na pilha
		
		// Todos os outros métodos das coleções
		// fila.clear(); // Limpar
		// fila.size(); // Tamanho
		// fila.isEmpty(); // Verificar se esta vazia
		
		// OBS: pode usar foreach > ele mostrará os elemntos conforme ordem de saida
	}
}
