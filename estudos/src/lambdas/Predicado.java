package lambdas;

import java.util.function.Predicate;

public class Predicado {

	public static void main(String[] args) {
		// Recebe um unico argumento do tipo definido e devolve verdadeiro ou falso.
		Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto)) >= 750;
		
		Produto produto = new Produto("Notebook", 350, 0.15);
		System.out.println(isCaro.test(produto));
	}
}
