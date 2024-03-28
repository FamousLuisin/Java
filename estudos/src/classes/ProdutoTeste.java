package classes;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 5000.00);
		
		var p2 = new Produto();
		p2.nome = "Celular";
		p2.preco = 1000.00;
		
		System.out.println("Produto: " + p1.nome);
		System.out.println("preço: " + p1.precoComDesconto());
		
		System.out.println();
		
		System.out.println("Produto: " + p2.nome);
		System.out.println("preço: " + p2.precoComDesconto());
		
		System.out.println();
		
		Produto.desconto = 0.50;
		
		System.out.println("Produto: " + p1.nome);
		System.out.println("preço: " + p1.precoComDesconto());
		
		System.out.println();
		
		System.out.println("Produto: " + p2.nome);
		System.out.println("preço: " + p2.precoComDesconto());
	}
}
