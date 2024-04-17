package oop.composicao.desafio;

public class Main {
	public static void main(String[] args) {
		
		Produto ferrari = new Produto("Ferrari", 500_000);
		Produto porsche = new Produto("Porsche", 200_000);
		Produto mustang = new Produto("Mustang", 180_000); 
		
		Item itemFerrari = new Item(ferrari, 1);
		Item itemPorsche = new Item(porsche, 2);
		Item itemMustang = new Item(mustang, 1);
		
		System.out.println(itemFerrari.valorItem());
		System.out.println(itemPorsche.valorItem());
		System.out.println(itemMustang.valorItem());
		
		System.out.println("========================");
		
		Compra compra1 = new Compra();
		compra1.adicionarItem(itemPorsche);
		compra1.adicionarItem(itemFerrari);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem(itemMustang);
		
		System.out.println(compra1.valorCompra());
		System.out.println(compra2.valorCompra());
		
		System.out.println("========================");
		
		Cliente c1 = new Cliente("Jonathan");
		c1.adicionarCompra(compra1);
		c1.adicionarCompra(compra2);
		
		System.out.println(c1.valorGasto());
	}
}
