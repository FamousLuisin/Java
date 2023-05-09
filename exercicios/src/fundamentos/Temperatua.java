package fundamentos;

public class Temperatua {
	
	public static void main(String[] args) {
		
		final double FATOR = 5.0/9;
		final int CONSTANTE = 32;
		
		double fahrenheit = 86;
		double celsius;
		
		celsius = (fahrenheit - CONSTANTE) * FATOR;
		System.out.println("Celsius: " + celsius + "°C.");
		
		fahrenheit = 0;
		celsius = (fahrenheit - CONSTANTE) * FATOR;
		System.out.println("Celsius: " + celsius + "°C.");
		
	}
}
