package br.ucb.poo;

import java.util.Scanner;

import br.ucb.poo.bean.*;

public class Executora{
	
	public static void limpeza() {
		for (int i = 0; i < 100; ++i)  
		       System.out.println(); 
	}
	
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ListaProdutos listaProdutos = new ListaProdutos();
        ListaUsuario listaUsuario = new ListaUsuario();
        ListaCarrinho listaCarrinho = new ListaCarrinho();
        Usuario usuarioAtual = null;
        
        

        int option = 0;

        do{
            System.out.println("=============================================");
            System.out.println("             MARKETPLACE - HOME              ");
            System.out.println("=============================================");
            System.out.println("1 - LOGIN/LOGOUT  2 - REGISTRO  0 - ENCERRAR ");
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - -");
            System.out.println("   3 - BUSCAR PRODUTO   4 - LISTA CARRINHO   ");
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - -");
            System.out.println("         5 - ADICIONAR NOVO PRODUTO          ");
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - -");

            System.out.println(usuarioAtual);
            
            option = scanner.nextInt();
            

            switch(option){
                case (1):
                	if(usuarioAtual == null && listaUsuario.getListaLogin().size() > 0)
                		usuarioAtual = listaUsuario.Login();
                	else {
                		System.out.println("Deseja fazer logout? [1] sim - [0] nao");
                		option = scanner.nextInt();
                		if(option == 1)
                			usuarioAtual = null;
                	}
                break;

                case (2):
                	if(usuarioAtual == null)
                		listaUsuario.Registro();
                	else
                		System.out.println("Não permitido");
                break;
                
                case (3):
                	BuscarProduto buscar = new BuscarProduto();
                	buscar.tipoBusca(listaProdutos, usuarioAtual, listaCarrinho);
                break;
                
                case (4):
                	if(usuarioAtual != null) {
                		if(usuarioAtual.getCodigo().charAt(0) == 'U') {
                			listaCarrinho.mostrar(listaProdutos.getListaProdutos(), usuarioAtual);
                		}
                		else {
                			System.out.println("Sem permissao voce nao e CLIENTE");
                		}
                	}
                	else {
                		System.out.println("Sem permissao, voce nao esta logado");
                	}
                break;
                
                case (5):
                	if(usuarioAtual != null) {
                		if(usuarioAtual.getCodigo().charAt(0) == 'V') {
                			listaProdutos.novoProduto(usuarioAtual.getCodigo());
                			System.out.println(listaProdutos.getListaProdutos());
                		}
                		else {
                			System.out.println("Sem permissao voce nao e vendedor");
                		}
                	}
                	else
                		System.out.println("Sem permissao, voce nao esta logado");
                break;
                
                case (6):
                	listaProdutos.teste();
                break;
            }
            
        }while(option != 0);
        
        scanner.close();
        
    }
}
