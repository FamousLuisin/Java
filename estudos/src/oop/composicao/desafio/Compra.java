package oop.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	final List<Item> listaItens = new ArrayList<Item>();
	
	double valorCompra() {
		double valorTotal = 0;
		for (Item item : listaItens) {
			valorTotal += item.valorItem();
		}
		
		return valorTotal;
	}
	
	void adicionarItem(Item item) {
		this.listaItens.add(item);
	}
}
