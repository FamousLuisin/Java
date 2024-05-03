package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		// Consumer recebe um parametro e não retorna nada (void)
		Consumer<Produto> imprimir = p -> System.out.println(p.nome + "!!!");
		
		Produto p1 = new Produto("Ferrari", 900_000, 0.10);
		// Recebe um parametro e não retorna nada
		imprimir.accept(p1);
		
		System.out.println("\n==========\n");
		
		Produto p2 = new Produto("Porsch", 700_000, 0.10);
		Produto p3 = new Produto("Mustang", 300_000, 0.10);
		Produto p4 = new Produto("Gol", 50_000, 0.10);
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4);
		
		// Como imprimir é um consumer pode passar ele direto para o forEach como parametro
		produtos.forEach(imprimir);
		
		System.out.println("\n==========\n");
		
		// Aqui chama cada produto dentro da lista e imprime esse elemento
		produtos.forEach(System.out::println);
		
		System.out.println("\n==========\n");
		
		// Aqui chama cada produto da lista e imprime seu nome
		produtos.forEach(p -> System.out.println(p.nome));
	}
}
