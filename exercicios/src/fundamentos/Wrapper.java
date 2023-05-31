package fundamentos;

public class Wrapper {
	public static void main(String[] args) {
		
		//Objeto de classes primitivos 
		
		//wrapper numerais
		Byte b = 100;
		Short s = 1000;
		//Integer.parseInt(entrada.next())
		Integer i = 10000;
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		//wrapper numerais ponto flutuante
		Float f = 125.05F;
		System.out.println(f);
		
		Double d = 180.666;
		System.out.println(d);
		

		//wrapper boolean
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		//wrapper caracter
		Character c = '#';
		System.out.println(c.toString());
	}
}
