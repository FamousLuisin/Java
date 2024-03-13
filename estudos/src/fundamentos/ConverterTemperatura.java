package fundamentos;

public class ConverterTemperatura {

	public static void main(String[] args) {
		double fahrenheit = 86;
		final double X = 32;
		final double Y = 5.0/9.0;
		
		double celsius = (fahrenheit - X) * Y;
		System.out.println("O resultado é: " + celsius + "°C");
		
		fahrenheit = 0;
		celsius = (fahrenheit - X) * Y;
		System.out.println("O resultado é: " + celsius + "°C");
	}
}
