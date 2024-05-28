package concorrente_distribuida.servidor;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	public static void main(String[] args) {
		try {
			ServerSocket servidor = new ServerSocket(12345);
			Socket socket = servidor.accept();
			ObjectOutputStream saida = new ObjectOutputStream(socket.getOutputStream());
			ObjectInputStream entrada = new ObjectInputStream(socket.getInputStream());
			
			while (true) {
				String msgRecebida = (String) entrada.readObject();
				if (msgRecebida.equals("Luis Filipe")) {
					System.out.println("Mensagem recebida: " + msgRecebida);
					saida.writeObject(new String("Recebida pelo server"));
					break;
				}
			}
			
			entrada.close();
			saida.close();
			socket.close();
			servidor.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
