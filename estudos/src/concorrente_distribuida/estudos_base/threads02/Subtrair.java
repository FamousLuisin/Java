package concorrente_distribuida.estudos_base.threads02;

public class Subtrair extends Thread{
	double a;
	double b;
	
	public Subtrair(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public void run() {
		System.out.println("Subtrair = " + (a - b));
	}
}
