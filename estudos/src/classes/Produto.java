package classes;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25;
	
	// Construtor
	Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	// Construtor base
	Produto() {
	}
	
	// métodos
	double precoComDesconto() {
		double novoPreco = preco * (1 - desconto);
		return novoPreco;
	}
	
}
