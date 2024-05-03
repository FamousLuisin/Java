package lambdas;

public class CalculoTeste {

	public static void main(String[] args) {
		Calculo soma = new Somar();
		Calculo multiplica = new Multiplicar();
		
		System.out.println("Tradicional: " + soma.executar(5, 5));
		System.out.println("Tradicional: " + multiplica.executar(5, 5));
		
		System.out.println("===================");
		
		// Função lambda
		Calculo calc = (x, y) -> {
			return x + y;
		};
		System.out.println("Lambda: " + calc.executar(5, 5));
		
		// Função lambda reduzida (Já está havendo um return)
		calc = (x, y) -> x * y;
		System.out.println("Lambda: " + calc.executar(5, 5));
	}
}
