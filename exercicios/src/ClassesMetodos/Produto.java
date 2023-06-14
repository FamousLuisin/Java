package ClassesMetodos;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = 0.25;
	
	//Construtor padrão
	Produto(){
		
	}
	
	//Construtor
	Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	double precoComDesconto() {
		double precoAtual = preco * (1 - desconto);
		
		return precoAtual;
	}
}
