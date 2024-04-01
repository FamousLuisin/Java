package concorrente_distribuida.Threads2;

public class Somar extends Thread{
	
	double a;
	double b;
	
	public Somar(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public void run() {
		System.out.println("Soma = " + (a + b));
	}
}
