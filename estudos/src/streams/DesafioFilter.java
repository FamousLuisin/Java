package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {
		Produto p1 = new Produto("Produto 1", 100.0, 0.1, false);
        Produto p2 = new Produto("Produto 2", 50.0, 0.5, true);
        Produto p3 = new Produto("Produto 3", 200.0, 0.4, false);
        Produto p4 = new Produto("Produto 4", 80.0, 0.4, true);
        Produto p5 = new Produto("Produto 5", 120.0, 0.3, false);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
        
        Predicate<Produto> bomDesconto = p -> p.desconto >= 0.4;
        
        Predicate<Produto> freteGratuito = p -> p.freteGratis;
        
        Function<Produto, String> melhoresProdutos = p -> {
        	String msg = "O produto %s esta incrivel, com seu valor de %.2f para %.2f";
        	String texto = String.format( msg, p.nome, p.valor, p.valor * (1 - p.desconto));
        	return texto;
        };
        
        produtos.stream()
        	.filter(bomDesconto)
        	.filter(freteGratuito)
        	.map(melhoresProdutos)
        	.forEach(System.out::println);
	}
}
