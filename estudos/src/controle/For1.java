package controle;

public class For1 {

	public static void main(String[] args) {
		
		System.out.println("For");
		
		for(int i = 1; i <= 10; i++) {
			System.out.printf("i = %d \n", i);
		}
		
		System.out.println();
		
		int y = 0;
		for(;y <= 10;) {
			System.out.println("y = " + y);
			y+=2;
		}
	}
}
