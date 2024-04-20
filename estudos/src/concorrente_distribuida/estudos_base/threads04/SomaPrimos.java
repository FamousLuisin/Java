package concorrente_distribuida.estudos_base.threads04;

public class SomaPrimos extends Thread{
	
	private int i;
	private int f;
	private int soma=0;
	
	public SomaPrimos(int i, int f) {
		this.i = i;
		this.f = f;
	}
	
	public boolean eprimo(int numero) {
		int div = 1;
		int cont = 0;
		
		while (div <= numero) {
			if (numero % div == 0) {
				cont++;
			}
			div++;
		}
		
		if (cont == 2) {
			return true;
		}
		
		return false;
	}
	
	public void run() {
		int x = this.i;
		int y = this.f;
		
		while (x <= y) {
			if(eprimo(x)){
				this.soma += x;
			}
			x++;
		}	
	}
	
	
	public int getSoma(){
		return this.soma;
	}

	
}
