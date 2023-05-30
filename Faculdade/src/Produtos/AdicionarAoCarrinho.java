package Produtos;

import java.util.ArrayList;
import java.util.Scanner;

public class AdicionarAoCarrinho {
	public void adcionar(ArrayList<Produto> listaCarrinho, ArrayList<Produto> listaProdutos) {
		
		Scanner scanner=new Scanner(System.in);
		
		boolean adicionou = false;
		int option, i=1;
		do {
			System.out.println("Deseja alguns desses produtos: [digite o numero dele se sim] ou [digite 0 caso nao queira nenhum]");
			for(Produto c: listaProdutos) {
				System.out.println(i + " - " + c.getName());
				i++;
			}
			option = scanner.nextInt();
			if(option == 0) {
				System.out.println("Voltando a tela");
			}
			else {
				listaCarrinho.add(listaProdutos.get(option - 1));
				adicionou = true;
			}
		}while(option != 0 && !adicionou);
	}
}
