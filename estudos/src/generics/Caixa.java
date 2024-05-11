package generics;

// Anotação do genérico
public class Caixa<T> {
	
	private T coisa;

	public T getCoisa() {
		return coisa;
	}

	public void setCoisa(T coisa) {
		this.coisa = coisa;
	}
	
	
}
