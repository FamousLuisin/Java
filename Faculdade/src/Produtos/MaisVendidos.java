package Produtos;

import java.util.ArrayList;

public class MaisVendidos implements TipoBusca{

	@Override
	public void ordenarLista(ArrayList<Produto> listaCarrinho, ArrayList<Produto> listaProdutos) {
		
		ArrayList<Produto> listaVendidos = new ArrayList<Produto>();
		Produto intermediaria;
		
		for(int i = 0; i < listaProdutos.size(); i++) {
			for(int j = 0; j < listaProdutos.size() - i - 1; j++) {
				if(listaProdutos.get(j).getVendas() < listaProdutos.get(j + 1).getVendas()) {
					intermediaria = listaProdutos.get(j + 1);
					listaProdutos.set(j + 1, listaProdutos.get(j));
					listaProdutos.set(j, intermediaria);
				}
			}
		}
		

		for(Produto c: listaProdutos) {
			listaVendidos.add(c);
		}
		
		AdicionarAoCarrinho adicionar = new AdicionarAoCarrinho();
		adicionar.adcionar(listaCarrinho, listaVendidos);
		
	}

	public void vendidos(ArrayList<Produto> listaCarrinho, ArrayList<Produto> listaProdutos){
	
		MaisVendidos gerar = new MaisVendidos();
		
		gerar.ordenarLista(listaCarrinho, listaProdutos);
		
		
		
	}
	
}
