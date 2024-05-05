package tratamento_de_erro;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		try {
			System.out.println(7 / 0);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			// Forçar que algo seja executado mesmo que dê algum erro
			System.out.println("Finalmente...");
			entrada.close();
		}
		
		System.out.println("Fim!");
	}
}
