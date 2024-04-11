package collections;

import java.util.HashSet;

public class Hash {
	
	public static void main(String[] args) {
		
		// Pesquisar dentro de um Set é mais rapido q pesquisar dentro de um List
		HashSet<Usuario> usuarios = new HashSet<>();
		
		usuarios.add(new Usuario("Lulu"));
		usuarios.add(new Usuario("Carvas"));
		usuarios.add(new Usuario("Mike"));
		usuarios.add(new Usuario("Noki"));
		usuarios.add(new Usuario("Noki"));
		
		boolean resultados = usuarios.contains(new Usuario("Mike")); // Só ocorre por causa do HashCode
		System.out.println(resultados);
	}
}
