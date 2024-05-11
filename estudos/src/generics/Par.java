package generics;

import java.util.Objects;

public class Par<K, V> {

	private K chave;
	private V valor;
	
	public Par() {
		
	}
	
	public Par(K chave, V valor) {
		this.chave = chave;
		this.valor = valor;
	}
	
	public V getValor() {
		return valor;
	}
	public void setValor(V valor) {
		this.valor = valor;
	}
	
	public K getChave() {
		return chave;
	}
	public void setChave(K chave) {
		this.chave = chave;
	}

	@Override
	public int hashCode() {
		return Objects.hash(chave);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Par<?, ?> other = (Par<?, ?>) obj;
		return Objects.equals(chave, other.chave);
	}
	
	
}
