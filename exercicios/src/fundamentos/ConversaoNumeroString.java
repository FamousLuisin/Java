package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		
		int num2 = 2200;
		System.out.println(Integer.toString(num2).length());
		
		int num3 = 30;
		System.out.println(("" + num3).length());
	}
}
