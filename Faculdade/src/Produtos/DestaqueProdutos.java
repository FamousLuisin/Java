package Produtos;

import java.util.ArrayList;

public class DestaqueProdutos implements TipoBusca{
	
	@Override
	public void ordenarLista(ArrayList<Produto> listaCarrinho, ArrayList<Produto> listaProdutos) {
		
		ArrayList<Produto> listaDestaque = new ArrayList<Produto>();
		Produto intermediaria;
		
		for(int i = 0; i < listaProdutos.size(); i++) {
			for(int j = 0; j < listaProdutos.size() - i - 1; j++) {
				if(listaProdutos.get(j).getEstrelas() < listaProdutos.get(j + 1).getEstrelas()) {
					intermediaria = listaProdutos.get(j + 1);
					listaProdutos.set(j + 1, listaProdutos.get(j));
					listaProdutos.set(j, intermediaria);
				}
			}
		}
		
		for(Produto c: listaProdutos) {
			listaDestaque.add(c);
		}
		
		AdicionarAoCarrinho adicionar = new AdicionarAoCarrinho();
		adicionar.adcionar(listaCarrinho, listaDestaque);
		
	}

	
	public void destaques(ArrayList<Produto> listaCarrinho, ArrayList<Produto> listaProdutos) {
		
		DestaqueProdutos ordenar = new DestaqueProdutos();
		
		ordenar.ordenarLista(listaCarrinho, listaProdutos);
	
	}

}
