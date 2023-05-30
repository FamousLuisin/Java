package Produtos;

import java.util.ArrayList;

public class ListaProdutos {
    private ArrayList<Produto> listaProdutos;

    public ListaProdutos() {
        listaProdutos = new ArrayList<>();
        lista();
    }
    
    public void lista() {
        // (NOME, PREÇO, VENDAS, ESTRELAS, VENDEDOR, CATEGORIA)
        listaProdutos.add(new Produto("gtx 1650Ti", 1300.50, 100, 4.0, 10, "hardware"));
        listaProdutos.add(new Produto("gtx 1050Ti", 1000.50, 150, 4.0, 11, "hardware"));
        listaProdutos.add(new Produto("Mouse Redragon Griffin", 350.50, 105, 4.9, 11, "periferico"));
        listaProdutos.add(new Produto("Fone Gamer Alternativo", 50.00, 10, 3.5, 12, "periferico"));
        listaProdutos.add(new Produto("Celular Samsung A32", 1550.50, 130, 5.0, 11, "celular"));
        listaProdutos.add(new Produto("Guitarra Tagima Tg530", 1200.50, 50, 4.8, 13, "musica"));
    }

    public ArrayList<Produto> getListaProdutos() {
        return listaProdutos;
    }

	public void setListaProdutos(ArrayList<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}

}