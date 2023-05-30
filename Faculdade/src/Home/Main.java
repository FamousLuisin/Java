package Home;

import java.util.Scanner;
import java.util.ArrayList;

import Produtos.BuscarProduto;
import Produtos.ListaProdutos;
import Produtos.CarrinhoProdutos;
import Produtos.Produto;
import Produtos.AdicionarNovoProduto;

public class Main{
	
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        CarrinhoProdutos listaCarrinho = new CarrinhoProdutos();
        ListaProdutos listaProdutos = new ListaProdutos();
        AdicionarNovoProduto adicionarProduto = new AdicionarNovoProduto();

        ArrayList<Produto> listaMeuCarrinho = listaCarrinho.getListaCarrinho();
        ArrayList<Produto> listaTodosProdutos = listaProdutos.getListaProdutos();
        
    	//BuscarProduto buscar = new BuscarProduto();

        int option = 0;

        do{
            System.out.println("=============================================");
            System.out.println("             MARKETPLACE - HOME              ");
            System.out.println("=============================================");
            System.out.println("   1 - LOGIN  2 - REGISTRO  0 - ENCERRAR     ");
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - -");
            System.out.println("   3 - BUSCAR PRODUTO   4 - LISTA CARRINHO   ");
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - -");
            System.out.println("         5 - ADICIONAR NOVO PRODUTO          ");
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - -");

            option = scanner.nextInt();

            switch(option){
                case (1):
                    System.out.println("==============================================");
                    System.out.println("                    LOGIN                     ");
                    System.out.println("==============================================");
                    System.out.println("Escolha o perfil de acesso:                   ");
                    System.out.println("1 - Continuar com acesso público              ");
                    System.out.println("2 - Anunciante                                ");
                    System.out.println("3 - Comprador                                 ");
                    System.out.println("4 - Admin                                     ");
                    System.out.println("                                              ");
                break;

                case (2):
                    System.out.println("==============================================");
                    System.out.println("                   REGISTRO                   ");
                    System.out.println("==============================================");
                break;
                
                case (3):
                	BuscarProduto.main(args, listaMeuCarrinho, listaTodosProdutos);
                break;
                case (4):
                	for(Produto c: listaMeuCarrinho) {
                		System.out.println(c);
                	}
                break;
                case (5):
                	adicionarProduto.AdicionarProduto(listaTodosProdutos);
                break;
            }
        }while(option != 0);
    }
}

