package concorrente_distribuida.monitores.threads01;

public class Counter {
	private Integer value;
	
	public Counter(Integer value) {
		this.value = value;
	}
	
	public synchronized void increment() {
		this.value++;
	}
	
	public Integer getValue() {
		return this.value;
	}
}
