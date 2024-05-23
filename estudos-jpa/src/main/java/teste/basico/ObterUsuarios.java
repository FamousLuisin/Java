package teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class ObterUsuarios {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("estudos-jpa");			
		EntityManager manager = factory.createEntityManager();
		
		// Comandos sql com jpql
		String jpql = "select u from Usuario u";
		
		// TypedQuery<Usuario> query = manager.createQuery(jpql, Usuario.class);
		// Limitar a quantidade de registros
		// query.setMaxResults(5);
		// List<Usuario> usuarios = query.getResultList();
		
		// Tudo em uma linha
		List<Usuario> usuarios = manager
					.createQuery(jpql, Usuario.class)
					.setMaxResults(5)
					.getResultList();
		
		for (Usuario usuario : usuarios) {
			System.out.println("Id: " + usuario.getId() + " - Nome: " + usuario.getNome());
			System.out.println("=======================");
		}
				
		manager.close();
		factory.close();
	}
}
