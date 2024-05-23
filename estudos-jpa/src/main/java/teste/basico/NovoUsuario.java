package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {

	public static void main(String[] args) {
		
		// Criar um EntityManager
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("estudos-jpa");
		
		// Persistencia no bd -> ele possui a conexão
		EntityManager manager = factory.createEntityManager();
		
		Usuario novoUsuario = new Usuario("Noki", "noki@email.com");
		
		// Caso não haja a tabela ela já é criada
		
		// Iniciar uma transação
		manager.getTransaction().begin();
		// O persist funciona em contextos de transação
		manager.persist(novoUsuario);
		// Efetivar uma trsanção
		manager.getTransaction().commit();
		
		manager.clear();
		factory.close();
	}
}
