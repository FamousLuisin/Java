package classes;

public class AreaCircTest {

	public static void main(String[] args) {
		
		AreaCirc c1 = new AreaCirc(5);
		System.out.println(c1.area());
		
		
		AreaCirc c2 = new AreaCirc(10);
		System.out.println(c2.area());
		
		// Acessar atributo de instancia
		// Não tem como mudar o valor de PI já que ele é uma constante
		// AreaCirc.PI = 3.1415;
		
		System.out.println("===============");
		System.out.println(c1.area());
		System.out.println(c2.area());
		System.out.println("===============");
		
		// Usando o método de classe para calcular a area
		System.out.println(AreaCirc.area(100));
	}
}
