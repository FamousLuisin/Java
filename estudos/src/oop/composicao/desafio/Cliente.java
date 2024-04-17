package oop.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	String nome;
	final List<Compra> compras = new ArrayList<Compra>();
	
	Cliente(String nome){
		this.nome = nome;
	}
	
	double valorGasto() {
		double totalGasto = 0;
		for (Compra compra : compras) {
			totalGasto += compra.valorCompra();
		}
		
		return totalGasto;
	}
	
	void adicionarCompra(Compra compra) {
		this.compras.add(compra);
	}
}
