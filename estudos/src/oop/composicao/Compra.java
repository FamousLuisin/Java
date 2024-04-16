package oop.composicao;

import java.util.ArrayList;

public class Compra {
	
	String cliente;
	ArrayList<Item> produtos = new ArrayList<Item>();
	
	void adicionarItem(Item item) {
		this.produtos.add(item);
		item.compra = this;
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for (Item item : produtos) {
			total += item.quantidade * item.preco;
		}
		return total;
	}
}
