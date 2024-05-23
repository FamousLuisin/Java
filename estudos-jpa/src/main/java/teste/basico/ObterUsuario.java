package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class ObterUsuario {

	public static void main(String[] args) {
		
		// Criar um EntityManager
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("estudos-jpa");
				
		// Persistencia no bd -> ele possui a conexão
		EntityManager manager = factory.createEntityManager();
		
		// Trabalhar com select diferente de insert não precisa de transação
		// find(tipo de classe que quero mapear, identificador)
		Usuario usuario = manager.find(Usuario.class, 6L);
		System.out.println(usuario.getNome());
		
		manager.close();
		factory.close();
	}
}
