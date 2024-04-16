package oop.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		
		Compra  c1 = new Compra();
		
		c1.cliente = "Jhonson";
		c1.adicionarItem(new Item("Caneta", 20, 7.50));
		c1.adicionarItem(new Item("Borracha", 12, 2.50));
		c1.adicionarItem(new Item("Caderno", 3, 20.50));
		
		System.out.println("Tamanho da lista: " + c1.produtos.size());
		System.out.println("Valor total: " + c1.obterValorTotal());
	}
	
}
