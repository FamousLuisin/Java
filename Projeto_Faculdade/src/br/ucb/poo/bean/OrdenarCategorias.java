package br.ucb.poo.bean;

import java.util.ArrayList;
import java.util.Scanner;



public class OrdenarCategorias {	
		
		public void listaCategoria(ArrayList<Produto> listaProdutos, String categoria, Usuario usuario, ListaCarrinho listaCarrinho){
			
			ArrayList<Produto> listaCategoria = new ArrayList<Produto>();
			
			for(Produto produto: listaProdutos) {
				if(produto.getCategoria() == categoria) {
					listaCategoria.add(produto);
				}
			}
			
			for (Produto produto : listaCategoria) {
				System.out.println(produto);
			}
			
			
			if(usuario != null) {
				if(usuario.getCodigo().charAt(0) == 'U') {
					System.out.println("Deseja adicionar algum produto? [0] nao - [1] sim");
					Scanner scanner = new Scanner(System.in);
					int num = scanner.nextInt();
					if(num == 1) {
						listaCarrinho.adicionarProduto(listaCategoria, usuario);
					}
				}
			}
			
			
		}
		
		public void categorias(ArrayList<Produto> listaProdutos, Usuario usuario, ListaCarrinho listaCarrinho) {
			 Scanner scanner=new Scanner(System.in);
			 int option;
			 
			 do{
		            System.out.println("==============================================");
		            System.out.println("                  CATEGORIA                   ");
		            System.out.println("==============================================");
		            System.out.println("1 - COMPUTADOR       2 - ELETRODOMESTICOS     ");
		            System.out.println("3 - CARROS           4 - MESA E BANHO         ");
		            System.out.println("5 - MUSICA           6 - CELULARES            ");
		            System.out.println("7 - CONSTRUÇÃO       0 - OUTROS               ");
		            System.out.println("---------------tela de busca[99]---------------");
		            

		            option = scanner.nextInt();

		            switch(option){
		            
		            	case (0):
		            		String categoria = scanner.nextLine().toUpperCase();
		            		this.listaCategoria(listaProdutos, categoria, usuario, listaCarrinho);
		            	break;
		            	
		                case (1):
		                	this.listaCategoria(listaProdutos, "COMPUTADOR", usuario, listaCarrinho);
		                break;

		                case (2):
		                	this.listaCategoria(listaProdutos, "ELETRODOMESTICOS", usuario, listaCarrinho);
		                break;
		                
		                case (3):
		                	this.listaCategoria(listaProdutos, "CARROS", usuario, listaCarrinho);
		                break;
		                
		                case (4):
		                	this.listaCategoria(listaProdutos, "MESA E BANHO", usuario, listaCarrinho);
			            break;
			            
		                case (5):
		                	this.listaCategoria(listaProdutos, "MUSICA", usuario, listaCarrinho);
			            break;
			            
		                case (6):
		                	this.listaCategoria(listaProdutos, "CELULARES", usuario, listaCarrinho);
			            break;
			            
		                case (7):
		                	this.listaCategoria(listaProdutos, "CONSTRUÇÃO", usuario, listaCarrinho);
			            break;
			            
		                case(99):

	                	break;
		                	
		            }
		        }while(option != 99);
		 }
	}

