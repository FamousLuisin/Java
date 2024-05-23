package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class RemoverUsuario {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("estudos-jpa");
		EntityManager manager = factory.createEntityManager();
		
		Usuario usuario = manager.find(Usuario.class, 7L);
		
		if (usuario != null) {
			manager.getTransaction().begin();
			
			// Deleter um usuario
			manager.remove(usuario);
			
			manager.getTransaction().commit();
		}
		
		factory.close();
		manager.clear();
	}
}
