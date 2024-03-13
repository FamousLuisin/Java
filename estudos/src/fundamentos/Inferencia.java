package fundamentos;

public class Inferencia {
	
	public static void main(String[] args) {
		//Não pode alterar o tipo das variaveis em Java
		double a = 4.5;
		System.out.println(a);
		
		//var define o tipo da varivael apartir do que ela recebe
		//No var a variavel assim que declarada deve tbm ser inicializada
		var b = 5.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		int d;
		d = 10;
		System.out.println(d);
	}
}
