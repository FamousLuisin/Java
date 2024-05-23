package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {

	public static void main(String[] args) {
		
		// Instanciando classe
		DAO<Produto> dao = new DAO<>(Produto.class);
		
		// Criar produto
		Produto produto = new Produto("UNO", 50_000.00);
		
		// Inserir Produto
		// dao.abrirT().incluir(produto).fecharT().fechar();
		
		// Inserir de maneira atomica
		dao.incluirAtomico(produto).fechar();
		
		System.out.println("Id do produto inserido: " + produto.getId());
	}
}
