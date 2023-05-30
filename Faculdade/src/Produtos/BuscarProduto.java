package Produtos;

import java.util.ArrayList;
import java.util.Scanner;
import Home.Main;

public class BuscarProduto {
	public static void main(String[] args, ArrayList<Produto> listaCarrinho, ArrayList<Produto> listaProdutos) {
		
		Scanner scanner=new Scanner(System.in);
		
		int option = 0;
		
		
		
		do{
			System.out.println("========== Tela de busca ==========");
			System.out.println("Deseja buscar como? ");
			System.out.println("Categoria [1] ");
			System.out.println("Mais Vendidos [2] ");
			System.out.println("Recomendados [3] ");
			System.out.println("Ver todos os produtos[4] ");
			System.out.println("Voltar a tela inicial[0]");
			
			
			option = scanner.nextInt();

            switch(option){
                case (1):
                    BuscaCategoria buscaCategoria = new BuscaCategoria();
                	buscaCategoria.categorias(listaCarrinho, listaProdutos);
                break;

                case (2):
                	MaisVendidos maisVendidos = new MaisVendidos();
                	maisVendidos.vendidos(listaCarrinho, listaProdutos);
                break;
                
                case (3):
                	DestaqueProdutos destaqueProdutos = new DestaqueProdutos();
                	destaqueProdutos.destaques(listaCarrinho, listaProdutos);
                break;
                case (4):
                	AdicionarAoCarrinho adicionar = new AdicionarAoCarrinho();
        			adicionar.adcionar(listaCarrinho, listaProdutos);
                break;
                
                case (0):

                break;
            }
        }while(option != 0);
	}
}
