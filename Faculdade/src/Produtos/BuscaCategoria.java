package Produtos;

import java.util.ArrayList;
import java.util.Scanner;

public class BuscaCategoria {
	
	
	public void listaCategoria(ArrayList<Produto> listaCarrinho, ArrayList<Produto> listaProdutos, String categoria){
		ArrayList<Produto> listaCategoria = new ArrayList<Produto>();
		
		for(Produto c: listaProdutos) {
			if(c.getCategoria() == categoria) {
				listaCategoria.add(c);
			}
		}
		
		AdicionarAoCarrinho adicionar = new AdicionarAoCarrinho();
		adicionar.adcionar(listaCarrinho, listaCategoria);
		
		
	}
	
	public void categorias(ArrayList<Produto> listaCarrinho, ArrayList<Produto> listaProdutos) {
		 Scanner scanner=new Scanner(System.in);
		 int option;
		 BuscaCategoria escolha = new BuscaCategoria();
		 
		 do{
	            System.out.println("=============================================");
	            System.out.println("             CATEGORIA             ");
	            System.out.println("=============================================");
	            System.out.println("-----Busca por qual categoria?-----");
	            System.out.println("-----hardware[1]-----");
	            System.out.println("-----musica[2]-----");
	            System.out.println("-----celular[3]-----");
	            System.out.println("-----perifericos[4]-----");
	            System.out.println("-----tela de busca[0]-----");
	            

	            option = scanner.nextInt();

	            switch(option){
	                case (1):
	                	this.listaCategoria(listaCarrinho, listaProdutos, "hardware");
	                break;

	                case (2):
	                	this.listaCategoria(listaCarrinho, listaProdutos, "musica");
	                break;
	                
	                case (3):
	                	this.listaCategoria(listaCarrinho, listaProdutos, "celular");
	                break;
	                
	                case (4):
	                	this.listaCategoria(listaCarrinho, listaProdutos, "listaProdutos");
		            break;
		            
	                case(0):

                	break;
	                	
	            }
	        }while(option != 0);
	 }
}

