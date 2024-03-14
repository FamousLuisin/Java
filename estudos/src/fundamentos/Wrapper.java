package fundamentos;

public class Wrapper {
	
	public static void main(String[] args) {
		
		//Wrapper numeros
		Byte b = 100;
		Short s = 1000;
		//Converter para Integer
		Integer i = Integer.parseInt("10000");
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 2);
		
		System.out.println();
		
		//Wrapper flutuantes
		Float f = 123.5F;
		Double d = 456.7;
		
		System.out.println(f);
		System.out.println(d);
		
		System.out.println();
		
		//Wrapper boolean
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		
		System.out.println();
		
		//Wrapper char
		Character c = '#';
		System.out.println(c + "...");
		
	}
}
