package tratamento_de_erro;

public class Basico {

	public static void main(String[] args) {
		String msg = null;
		
		// Não silenciar um erro -> só caso tenha um log para salvar nele
		try {
			imprimir(msg);
		} catch (Exception e) {
			System.out.println("Ocorreu um erro na impressão");
		}
		
		
		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException e) {
			// Imprimir a pilha de exessão
			System.out.println("Ocorreu um erro: " + e.getMessage());
		}
		
		System.out.println("FIM");
	}
	
	public static void imprimir(String msg) {
		System.out.println(msg.toLowerCase());
	}
}
