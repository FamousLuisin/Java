package concorrente_distribuida.Threads2;

public class Main {
	public static void main(String[] args) {
		Somar thread_somar = new Somar(5, 5);
		Multiplicar thread_multiplicar = new Multiplicar(5, 5);
		Dividir thread_dividir = new Dividir(5, 5);
		Subtrair thread_subtrair = new Subtrair(5, 5);
		
		
		thread_somar.start();
		thread_subtrair.start();
		thread_multiplicar.start();
		thread_dividir.start();
	}
}
