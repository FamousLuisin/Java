package infra;

import modelo.basico.Produto;

// Class derivada de DAO especifica para Produto
public class ProdutoDAO extends DAO<Produto> {

	public ProdutoDAO() {
		super(Produto.class);
	}
}
