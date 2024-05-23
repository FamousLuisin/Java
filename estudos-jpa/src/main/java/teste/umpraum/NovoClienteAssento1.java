package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento1 {

	public static void main(String[] args) {
		Assento assento = new Assento("9C");
		Cliente cliente = new Cliente("Jhonson", assento);
		
		DAO<Object> dao = new DAO<>();
		
		// Se for dentro da mesma transação não é problema a ordem de inclusão
		// Já se for em transações diferentes a ordem deve ser seguida ou irá retorna excessão
		dao.abrirT().incluir(assento).incluir(cliente).fecharT().fechar();
	}
}
