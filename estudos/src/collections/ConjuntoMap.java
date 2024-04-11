package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ConjuntoMap {
	
	public static void main(String[] args) {
		// Map trabalha com chave valor
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		
		// Adicionar elementos ou alterar valor de uma chave
		usuarios.put(1, "Noc");
		usuarios.put(2, "Jhonson");
		usuarios.put(3, "Noki");
		usuarios.put(3, "Flinston");
		
		System.out.println("Tamanho: " + usuarios.size());
		System.out.println("Vazio: " + usuarios.isEmpty());
		
		System.out.println("Mostrar as chaves: " + usuarios.keySet());
		System.out.println("Mostrar os valores " + usuarios.values());
		System.out.println("Mostrar chave valor " + usuarios.entrySet());
		
		System.out.println("Contem chave? " + usuarios.containsKey(3));
		System.out.println("Contem valor? " + usuarios.containsValue("Jhonson"));
		
		System.out.println("Pegar valor apartir da chave: " + usuarios.get(1));
		System.out.println("Pegar valor apartir da chave: " + usuarios.get(3));
		
		System.out.println();
		
		System.out.println("Percorrer chaves");
		for (int chave : usuarios.keySet()) {
			System.out.println(chave);
		}
		
		System.out.println();
		
		System.out.println("Percorrer valores");
		for (String nome : usuarios.values()) {
			System.out.println(nome);
		}
		
		System.out.println();
		
		System.out.println("Percorrer chaves e valores");
		// Usar o Entry de utils
		for (Entry<Integer, String> registro : usuarios.entrySet()) {
			System.out.println(registro.getKey() + " = " + registro.getValue());
		}
		
		System.out.println();
		
		System.out.println("remover por chave: " + usuarios.remove(3));
		System.out.println("remover por chave valor: " + usuarios.remove(1, "Nick"));
	}
}
