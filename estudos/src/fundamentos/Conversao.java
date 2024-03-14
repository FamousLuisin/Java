package fundamentos;

public class Conversao {

	public static void main(String[] args) {
		
		double a = 1; //Ímplicita
		System.out.println(a);
		
		float b = 1.0F;
		float c = (float) 1.5; //Explícita (CAST)
		
		System.out.println(b);
		System.out.println(c);
		
		int i = 4;
		byte d = (byte) i; //Explícita (CAST)
		System.out.println(d);
		
		double e = 1.8889;
		int f = (int) e; //Explícita (CAST)
		
		System.out.println(f);
	}
}
