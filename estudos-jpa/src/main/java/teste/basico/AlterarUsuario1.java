package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario1 {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("estudos-jpa");			
		EntityManager manager = factory.createEntityManager();
		
		// Precisamos de uma transação
		manager.getTransaction().begin();
		
		Usuario usuario = manager.find(Usuario.class, 3L);
		
		usuario.setNome("Carvalho");
		usuario.setEmail("carvalho@email.com");
		
		// Método de update
		manager.merge(usuario);
		
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
	}
}
