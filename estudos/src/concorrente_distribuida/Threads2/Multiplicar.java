package concorrente_distribuida.Threads2;

public class Multiplicar extends Thread{
	double a;
	double b;
	
	public Multiplicar(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public void run() {
		System.out.println("Multiplicar = " + (a * b));
	}
}
