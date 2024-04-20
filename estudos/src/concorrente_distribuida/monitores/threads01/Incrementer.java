package concorrente_distribuida.monitores.threads01;

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