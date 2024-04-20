package concorrente_distribuida.monitores.threads02;

public class Usuario extends Thread {

	private String nome;
	private Carta carta;
	
	Usuario(String nome, Carta carta){
		this.nome = nome;
		this.carta = carta;
	}
	
	public void ler() throws InterruptedException {
		synchronized (this.carta) {
			while(!this.carta.isEnviada()) {
				System.out.println("Aguardando...");
				this.carta.wait();
			}
			System.out.println("Lendo: " + this.carta.getConteudo());
		}
	}
	
	public void enviar() {
		synchronized (this.carta) {
			this.carta.setEnviada(true);
			this.carta.notify();
		}
	}
	
	public void run() {
		if(nome.equalsIgnoreCase("Remetente")) {
			this.enviar();
			System.out.println("Enviando");
		}else {
			try {
				this.ler();
			} catch (InterruptedException e) {
				
			}
		}
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
