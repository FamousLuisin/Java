package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario2 {
	
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("estudos-jpa");			
		EntityManager manager = factory.createEntityManager();
		
		// Precisamos de uma transação
		manager.getTransaction().begin();
		
		Usuario usuario = manager.find(Usuario.class, 1L);
		
		usuario.setNome("Jhonson");
		
		// Método de update -> Mesmo sem chamar ele a consulta está sincronizada
		// Qualquer mudança em um objeto uma hora ou outra o jpa vai sincronizar com o bd
		// Acontece sempre que o objeto está no estado gerenciado
		// manager.merge(usuario);
		
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
	}
}
