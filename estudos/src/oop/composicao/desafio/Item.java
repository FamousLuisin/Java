package oop.composicao.desafio;

public class Item {

	final Produto produto;
	final int quant;
	
	Item(Produto produto, int quant){
		this.produto = produto;
		this.quant = quant;
	}
	
	double valorItem() {
		double valor = this.produto.valor * quant;
		
		return valor;
	}
}
