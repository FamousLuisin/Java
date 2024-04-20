package concorrente_distribuida.estudos_base.threads05;

public class Counter {
	private Integer value;
	
	public Counter(Integer value) {
		this.value = value;
	}
	
	public void increment() {
		this.value++;
	}
	
	public Integer getValue() {
		return this.value;
	}
}
