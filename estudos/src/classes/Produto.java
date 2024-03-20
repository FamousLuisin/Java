package classes;

public class Produto {

	String nome;
	double preco;
	double desconto;
	
	Produto(String nomeInicial, double precoInicial, double descontoInicial){
		nome = nomeInicial;
		preco = precoInicial;
		desconto = descontoInicial;
	}
	
	Produto() {
	}
	
	double precoComDesconto() {
		double novoPreco = preco * (1 - desconto);
		return novoPreco;
	}
	
}
