package br.ucb.poo.bean;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaProdutos {
	private ArrayList<Produto> listaProdutos;
	
	public ListaProdutos(){
		this.listaProdutos = new ArrayList<>();
	}
	
	public void novoProduto(String cod_vendedor) {
		Scanner scanner = new Scanner(System.in);
		
		String name, categoria, vendedor;
		int vendas, codigo, option_categoria;
		double estrelas;
		
		System.out.println("Nome Produto: ");
		name = scanner.nextLine();
		
		System.out.println("==============================================");
        System.out.println("                   REGISTRO                   ");
        System.out.println("Escolha o perfil de registro:                 ");
        System.out.println("1 - COMPUTADOR       2 - ELETRODOMESTICOS     ");
        System.out.println("3 - CARROS           4 - MESA E BANHO         ");
        System.out.println("5 - MUSICA           6 - CELULARES            ");
        System.out.println("7 - CONSTRUÇÃO       0 - OUTROS               ");
        System.out.println("==============================================");
        
        option_categoria = scanner.nextInt();
        scanner.nextLine();
        
        if(option_categoria == 1)
        	categoria = "COMPUTADOR";
        else if(option_categoria == 2)
        	categoria = "ELETRODOMESTICOS";
        else if(option_categoria == 3)
        	categoria = "CARROS";
        else if(option_categoria == 4)
        	categoria = "MESA E BANHO";
        else if(option_categoria == 5)
        	categoria = "MUSICA";
        else if(option_categoria == 6)
        	categoria = "CELULARES";
        else if(option_categoria == 7)
        	categoria = "CONSTRUCAO";
        else
        	categoria = scanner.nextLine().toUpperCase();	

		vendedor = cod_vendedor;
		
		System.out.println("vendas: ");
		vendas = scanner.nextInt();		
		
		System.out.println("valor: ");
		double valor = scanner.nextDouble();
		
		System.out.println("Estrelas: ");
		estrelas = scanner.nextDouble();
		
		codigo = this.listaProdutos.size() * 10;
		
		listaProdutos.add(new Produto(name, categoria, valor, estrelas, vendedor, vendas, codigo));
		
	}
	
	public void todosProdutos() {
		for (Produto produto : listaProdutos) {
			System.out.println(produto);
		}
	}
	
	public void teste() {
		this.listaProdutos.add(new Produto("Celular", "CELULARES", 5000, 3, "AAAA", 500, 10));
		this.listaProdutos.add(new Produto("Placa de video", "COMPUTADOR", 6000, 5, "AAAA", 5, 20));
		this.listaProdutos.add(new Produto("Geladeira", "ELETRODOMESTICOS", 7000, 4, "AAAA", 50, 30));
		this.listaProdutos.add(new Produto("Cama", "MESA E BANHO", 8000, 2, "AAAA", 3, 40));
		this.listaProdutos.add(new Produto("BMW", "CARROS", 9000, 5, "AAAA", 1, 50));
		this.listaProdutos.add(new Produto("Guitarra", "MUSICA", 3000, 5, "AAAA", 55, 60));
		this.listaProdutos.add(new Produto("Cimento", "CONSTRUCAO", 4000, 1, "AAAA", 5, 70));
		this.listaProdutos.add(new Produto("Sla", "SLA", 2000, 0, "AAAA", 0, 80));
	}

	public ArrayList<Produto> getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(ArrayList<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
}
