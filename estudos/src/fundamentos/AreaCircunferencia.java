package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		int raio = 3;
		//final deixa a variavel como uma constante
		//é uma boa pratica a constante ser com letra maiuscula
		final double PI = 3.14;
		
		double area = PI * raio * raio;	
		System.out.println(area);
		
		raio = 10;
		area = PI * raio * raio;	
		System.out.println("Área = " + area);
	}
}
