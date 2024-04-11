package collections;

import java.util.ArrayList;

public class ConjuntoLista {
	
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>(); // ArrayList não usar o hashcode (Apenas HashSet e HashMap)
		
		lista.add(new Usuario("Noc"));
		lista.add(new Usuario("Noki"));
		lista.add(new Usuario("Jhonson"));
		lista.add(new Usuario("Jojo"));
		lista.add(new Usuario("Noc"));
		
		
		lista.remove(2);
		lista.remove(new Usuario("Noki")); // Ta ocorrendo por causa do hashCode e equals
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
		
		System.out.println();
		
		System.out.println(lista.get(2)); // Acessar pelo indice diferente do set
		System.out.println("Contem? " + lista.contains(new Usuario("Jojo"))); // Ta ocorrendo por causa do hashCode e equals
		
		System.out.println();	
	}
}
