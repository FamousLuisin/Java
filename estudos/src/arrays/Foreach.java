package arrays;

public class Foreach {

	public static void main(String[] args) {
		double[] notas = {7.2, 9.5, 8.3, 3.9};
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + " ");
		}
		
		System.out.println("\n================");
		
		for (double nota : notas) {
			System.out.print(nota + " ");
		}
		
	}
}
