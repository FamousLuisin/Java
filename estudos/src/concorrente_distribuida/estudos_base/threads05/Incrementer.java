package concorrente_distribuida.estudos_base.threads05;

public class Incrementer extends Thread {
	private Counter counter;
	
	public Incrementer (Counter counter) {
		this.counter = counter;
	}
	
	public void run() {
		System.out.println(this.getName() + " incrementando contador...");
		this.counter.increment();
	}
}