package fundamentos;

public class areaCircunferencia {
	public static void main(String[] args) {
		double raio = 10;
		//final é para definir uma variavel como constante (É considerado uma boa pratica colocar nome de constante em CapsLk)
		final double PI = 3.14;
		double area = PI * raio * raio;
		System.out.println("Valor da area: " + area);
		
		raio = 3.5;
		area = PI * raio * raio;
		System.out.println("Valor da area: " + area);
	}
}
