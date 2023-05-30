package Produtos;

import java.util.ArrayList;

public class CarrinhoProdutos {
	private ArrayList<Produto> listaCarrinho;
	
	public CarrinhoProdutos() {
        listaCarrinho = new ArrayList<>();
    }
 
	public ArrayList<Produto> getListaCarrinho() {
		return listaCarrinho;
	}

	public void setListaCarrinho(ArrayList<Produto> listaCarrinho) {
		this.listaCarrinho = listaCarrinho;
	}
    
    
}
