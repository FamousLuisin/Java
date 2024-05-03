package lambdas;

// Não permite instanciar mais de um método em uma interface (Essencial para lambdas)
@FunctionalInterface
public interface Calculo {

	//Precisa ter apenas um método abstrado
	double executar(double a, double b);
	
	// Pode ter métodos default
	default String func() {
		return "Método defaul interface calculo";
	}
	
	// Pode ter métodos staticos
	static String inter() {
		return "Método statico interface calculo";
	}
}
