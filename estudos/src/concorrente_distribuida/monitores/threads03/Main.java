package concorrente_distribuida.monitores.threads03;

public class Main {
	public static void main(String[] args) {
		String[] messages = {
				"primeira mensagem",
				"segunda mensagem",
				"terceira mensagem",
				"END"
		};

		Packet packet = new Packet();
		
		Sender sender = new Sender(packet, messages);

		Receiver receiver = new Receiver(packet, 1);
		
		sender.start();

		receiver.start();
	}
}