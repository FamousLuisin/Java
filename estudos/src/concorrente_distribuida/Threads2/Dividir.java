package concorrente_distribuida.Threads2;

public class Dividir extends Thread{
	double a;
	double b;
	
	public Dividir(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public void run() {
		System.out.println("Dividir = " + (a / b));
	}
}
