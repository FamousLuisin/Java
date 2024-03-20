package classes;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4500.00, 0.15);
		
		var p2 = new Produto();
		p2.nome = "Celular";
		p2.preco = 2500.00;
		p2.desconto = 0.10;
		
		System.out.println("Produto: " + p1.nome);
		System.out.println("preço: " + p1.precoComDesconto());
		
		System.out.println();
		
		System.out.println("Produto: " + p2.nome);
		System.out.println("preço: " + p2.precoComDesconto());
	}
}
