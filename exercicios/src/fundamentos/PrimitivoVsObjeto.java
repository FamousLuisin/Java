package fundamentos;

public class PrimitivoVsObjeto {
	public static void main(String[] args) {
		
		//"s" é um objeto, podendo ser escrito assim 
		String s = new String("texto qualquer");
		//objetos possuem comportamentos
		s = s.toUpperCase();
		
		//wrappers
		int a = 123;
		System.out.println(a);
		
	}
}
