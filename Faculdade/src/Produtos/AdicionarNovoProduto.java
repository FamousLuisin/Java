package Produtos;

import java.util.ArrayList;
import java.util.Scanner;

public class AdicionarNovoProduto {
	public void AdicionarProduto(ArrayList<Produto> lista) {
		Scanner scanner=new Scanner(System.in);
		
		String name, categoria;
		int vendedor, vendas;
		double estrelas;
		
		System.out.println("Nome Produto: ");
		name = scanner.nextLine();
		
		System.out.println("Categoria: ");
		categoria = scanner.nextLine();
		
		System.out.println("vendedor: ");
		vendedor = scanner.nextInt();
		
		System.out.println("vendas: ");
		vendas = scanner.nextInt();		
		
		System.out.println("valor: ");
		double valor = scanner.nextDouble();
		
		System.out.println("Estrelas: ");
		estrelas = scanner.nextDouble();
		
		lista.add(new Produto(name, valor, vendas, estrelas, vendedor, categoria));	
	
	}
}
