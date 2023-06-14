package ClassesMetodos;

public class ProdutoTeste {
	public static void main(String[] args) {
		
		//int variavel = 10; Tipo: "int" nome: "variavel" valor: "10"
		//Scanner entrada = new Scanner(System.in); Tipo: "Scanner" nome: "entrada" nex:"Chamada do construtor"
		
		Produto p1 = new Produto("Notebook", 4500.50); //Tipo: "Produto" nome: "p1" construtor: "Produto()"
		
		Produto p2 = new Produto(); //Tipo: "Produto" nome: "p2" construtor: "Produto()"
		//Valores p2 - Chamar atributo
		p2.nome = "Celular";
		p2.preco = 1850.50;
		
		//Alterar o desconto de todos os produtos(Atributo static "Pertence a classe");
		Produto.desconto = 0.10;
		
		//Chamar método
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		
		System.out.println(p1.nome + ": " + precoFinal1);
		System.out.println(p2.nome + ": " + precoFinal2);
	}
}
