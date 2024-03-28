package classes;

public class AreaCirc {

	double raio;
	// Varivael que pertence a classe e não a instancia
	// Final tronar um atributo como contante e não variavel
	static final double PI = 3.14;
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	double area() {
		return PI * Math.pow(raio, 2);
	}
	
	static double area(double raio) {
		return PI * Math.pow(raio, 2);
	}
}
