package lambdas;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioLambdas {

	public static void main(String[] args) {
		Produto p1 = new Produto("iPad", 4000, 0.10);
		
		Function<Produto, Double> precoReal = p -> p.preco * (1 - p.desconto);
		
		UnaryOperator<Double> imposto = valor -> valor >= 2500 ? valor * 1.08 : valor;
		
		UnaryOperator<Double> frete = valor -> valor >= 3000 ? valor + 100 : valor + 50;
		
		UnaryOperator<Double> arredondar = valor -> {
			// Tava tende erro de localidade
			String formatar = String.format("%.2f", valor).replace(",", ".");

			double number = Double.parseDouble(formatar);
			
			return number;
		};
		
		Consumer<Double> formatarValor = valor -> System.out.println(("R$ " + valor).replace(".", ","));
		
		double valorFinal = precoReal.andThen(imposto).andThen(frete).andThen(arredondar).apply(p1);
		
		System.out.println("Preço real: " + precoReal.apply(p1));
		System.out.println("Preço com imposto: " + precoReal.andThen(imposto).apply(p1));
		System.out.println("Preço com frete: " + precoReal.andThen(imposto).andThen(frete).apply(p1));
		System.out.println("Preço com Arredondado: " + valorFinal);
		
		formatarValor.accept(valorFinal);
		
	}
}
