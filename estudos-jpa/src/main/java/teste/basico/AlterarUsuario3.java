package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario3 {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("estudos-jpa");			
		EntityManager manager = factory.createEntityManager();
		
		// Precisamos de uma transação
		manager.getTransaction().begin();
		
		Usuario usuario = manager.find(Usuario.class, 1L);
		// Tirar do estado gerenciado
		manager.detach(usuario);
		
		usuario.setNome("Jhonson");
		
		// Quando forá do estado gerenciado para fazer a alteração precisa do merge
		manager.merge(usuario);
		
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
	}
}
