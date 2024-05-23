package infra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

// Extender da interface marcadora
public class DAO<E> {

	private static EntityManagerFactory factory;
	private EntityManager manager;
	private Class<E> classe;
	
	static {
		try {
			factory = Persistence.createEntityManagerFactory("estudos-jpa");
		} catch (Exception e) {
			// log -> log4j
		}
	}
	
	public DAO() {
		this(null);
	}
	
	public DAO(Class<E> classe) {
		this.classe = classe;
		manager = factory.createEntityManager();
	}
	
	// Método para abrir uma trsanação
	public DAO<E> abrirT(){
		manager.getTransaction().begin();
		return this;
	}
	
	// Método para fechar uma trsanação
	public DAO<E> fecharT(){
		manager.getTransaction().commit();
		return this;
	}
	
	// Método para persistir
	public DAO<E> incluir(E entidade){
		manager.persist(entidade);
		return this;
	}
	
	// Método para persistir de maneira unica / atomica
	public DAO<E> incluirAtomico(E entidade){
		return this.abrirT().incluir(entidade).fecharT();
	}
	
	// Método para obter todos
	public List<E> obterTodos(int quantidade, int deslocamento){
		if (classe == null) {
			throw new UnsupportedOperationException("Classe nula");
		}
		
		String jpql = "select e from " + classe.getName() + " e";
		
		TypedQuery<E> query = manager.createQuery(jpql, classe);
		query.setMaxResults(quantidade);
		query.setFirstResult(deslocamento);
		
		return query.getResultList();
	}
	
	public List<E> obterTodos(){
		return obterTodos(10, 0);
	}
	
	// Método para obeter por Id
	public E obterPorId(Object id) {
		return manager.find(classe, id);
	}
	
	// Método para fechar o manager
	public void fechar() {
		manager.close();
	}
}
