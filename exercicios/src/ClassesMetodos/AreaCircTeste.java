package ClassesMetodos;

public class AreaCircTeste {
	public static void main(String[] args) {
		
		//Forma de acessar e mudar um valor statico se for uma constante não pode ser alterado
		//AreaCirc.pi = 3.1415;
		
		//Calcular area a partir de um metodo da instancia
		AreaCirc area1 =  new AreaCirc(5.6);
		area1.raio = 100;
		System.out.println(area1.area());
		
		AreaCirc area2 =  new AreaCirc(10);
		System.out.println(area2.area());
		
		//Calcular area a partir de um metodo da classe
		System.out.println(AreaCirc.area(20));
	}
}
