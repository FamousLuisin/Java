package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste2 {

	public static void main(String[] args) {	
		// NÃO: int -> Double
		// SIM: double -> Double
		BinaryOperator<Double> calc = (x, y) -> {
			return x + y;
		};
		System.out.println("Binary Operator: " + calc.apply(5.0, 5.0));
		
		// Função lambda reduzida (Já está havendo um return)
		calc = (x, y) -> x * y;
		System.out.println("Binary Operator: " + calc.apply(5.0, 5.0));
	}
}
