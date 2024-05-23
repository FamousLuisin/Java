package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento2 {

	public static void main(String[] args) {
		
		Assento assento = new Assento("7D");
		Cliente cliente = new Cliente("Josuke", assento);
		
		// Se tentar salvar um cliente sem seu assento ja ter sido salvo da erro
		// Exceto se o assento for nulo
		// Para salvar isso -> no OneToOne deve colocar o cascade de persistencia
		DAO<Cliente> dao = new DAO<>(Cliente.class);
		dao.incluirAtomico(cliente);
	}
}
