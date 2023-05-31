package fundamentos;

public class ConversaoDeTipos {
	public static void main(String[] args) {
		//conversão implicita
		double d = 1;
		System.out.println(d);
		
		//conversão explicita (CAST) 
		float f = (float) 1.0;
		System.out.println(f);
		
		//conversão explicita (CAST)
		int i = 340;
		byte b = (byte) i;//Ele nn suport mais de 127, logo vai gerar perda de info
		System.out.println(b);
		
		//conversão explicita (CAST)
		double db = 1;
		int in = (int) db;
		System.out.println(in);
		
	}
}
