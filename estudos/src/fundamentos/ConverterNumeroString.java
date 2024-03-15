package fundamentos;

public class ConverterNumeroString {
	
	public static void main(String[] args) {
		Integer num1 = 10000;
		//Converter numero para String
		String num2 = num1.toString();
		
		System.out.println(num2.length());
		
		int num3 = 100;
		System.out.println(Integer.toString(num3).length());
	}
	
}
