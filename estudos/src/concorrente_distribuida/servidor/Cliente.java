package concorrente_distribuida.servidor;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Cliente {
	public static void main(String[] args) {
		try {
			Socket conexao = new Socket("localhost", 12345);
			// Escrita
			ObjectOutputStream saida = new ObjectOutputStream(conexao.getOutputStream());
			// Leitura
			ObjectInputStream entrada = new ObjectInputStream(conexao.getInputStream());
			
			saida.writeObject(new String("Luis Filipe"));
			
			while (true) {
				String msgRecebida = (String) entrada.readObject();
				if (msgRecebida.equals("Recebida pelo server")) {
					System.out.println("Deu tudo certo: " + msgRecebida);
					break;
				}
			}
			
			entrada.close();
			saida.close();
			conexao.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
