package Produtos;

public class Produto {
	private String name;
	private double valor;
	private int vendas;
	private double estrelas;
	private int vendedor;
	private String categoria;	
	
	Produto(String name, double valor, int vendas, double estrelas, int vendedor, String categoria){
		this.name = name;
		this.valor = valor;
		this.vendas = vendas;
		this.estrelas = estrelas;
		this.vendedor = vendedor;
		this.categoria = categoria;
	}
	
	

	@Override
	public String toString() {
		return "name=" + name + " - valor=" + valor + " - vendas=" + vendas + " - estrelas=" + estrelas
				+ " - vendedor=" + vendedor + " - categoria=" + categoria + "\n";
	}



	//GET E SET NAME
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//GET E SET VALOR
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	//GET E SET VENDAS
	public int getVendas() {
		return vendas;
	}

	public void setVendas(int vendas) {
		this.vendas = vendas;
	}
	
	//GET E SET ESTRELAS
	public double getEstrelas() {
		return estrelas;
	}

	public void setEstrelas(double estrelas) {
		this.estrelas = estrelas;
	}

	//GET E SET VENDEDOR
	public int getVendedor() {
		return vendedor;
	}

	public void setVendedor(int vendedor) {
		this.vendedor = vendedor;
	}

	//GET E SET CATEGORIA
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
}
