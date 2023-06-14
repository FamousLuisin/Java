package ClassesMetodos;

public class PrimeiroTrauma {
	
	int a = 3;
	static int b = 4;
	
	public static void main(String[] args) {
		
		PrimeiroTrauma valor = new PrimeiroTrauma();
		
		//Atributos de instancia so podem ser acessados quando criamos uma isntancia;
		System.out.println(valor.a);
		
		//Atributos staticos podem ser acessados pela mesma classe;
		System.out.println(b);
	}
}
