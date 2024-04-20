package concorrente_distribuida.monitores.threads02;

public class Main {

	public static void main(String[] args) {
		
		Carta c = new Carta("conteudo inicial");
		
		Usuario r = new Usuario("Remetente", c);
		Usuario d = new Usuario("Destinatario", c);
		
		d.start();
		r.start();
		
	}
}
