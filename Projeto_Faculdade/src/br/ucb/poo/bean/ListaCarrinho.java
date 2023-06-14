package br.ucb.poo.bean;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaCarrinho {
	private ArrayList<ListaCarrinho> listaCarrinho;
	private String codigo_usuario;
	private int codigo_produto;
	
	public ListaCarrinho() {
		listaCarrinho = new ArrayList<>();
	}
	
	public ListaCarrinho(String codigo_usuario, int codigo_produto) {
		this.codigo_usuario = codigo_usuario;
		this.codigo_produto = codigo_produto;
	}
	
	public void adicionarProduto(ArrayList<Produto> listaProdutos, Usuario usuario) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual produto deseja? ");
		int i = scanner.nextInt();
		
		this.listaCarrinho.add(new ListaCarrinho(usuario.getCodigo(), listaProdutos.get(i-1).getCodigo()));
		
	}
	
	public void mostrar(ArrayList<Produto> lista, Usuario usuario) {
		for (ListaCarrinho carrinho : listaCarrinho) {
			if(carrinho.getCodigo_usuario() == usuario.getCodigo()) {
				for (Produto produto : lista) {
					if (carrinho.getCodigo_produto() == produto.getCodigo()) {
						System.out.println(produto);
					}
				}
			}
		}
	}
	
	
	
	
	
	
	
	

	public ArrayList<ListaCarrinho> getListaCarrinho() {
		return listaCarrinho;
	}

	public void setListaCarrinho(ArrayList<ListaCarrinho> listaCarrinho) {
		this.listaCarrinho = listaCarrinho;
	}

	public String getCodigo_usuario() {
		return codigo_usuario;
	}

	public void setCodigo_usuario(String codigo_usuario) {
		this.codigo_usuario = codigo_usuario;
	}

	public int getCodigo_produto() {
		return codigo_produto;
	}

	public void setCodigo_produto(int codigo_produto) {
		this.codigo_produto = codigo_produto;
	}
	
}
