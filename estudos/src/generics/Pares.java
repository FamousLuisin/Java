package generics;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Pares<K extends Number, V> {

	private final Set<Par<K, V>> itens = new LinkedHashSet<>();

	public Set<Par<K, V>> getItens() {
		return itens;
	}
	
	public void adicionar(K chave, V valor) {
		// Vai sair do método
		if (chave == null) return;
		
		Par<K, V> novoPar = new Par<K, V>(chave, valor);
		
		// Se já contain esse par (No caso essa chave nos itens)
		// Remover o antigo valor presente em itens
		if (itens.contains(novoPar)) {
			itens.remove(novoPar);
		}
		
		itens.add(novoPar);
	}
	
	public V getValor(K chave) {
		if (chave == null) return null;
		
		Optional<Par<K, V>> parOpcional = itens.stream().filter(par -> chave.equals(par.getChave())).findFirst();
		System.out.println(parOpcional);
		
		return parOpcional.isPresent() ? parOpcional.get().getValor() : null;
	}
}
