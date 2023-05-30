package POO;

public class Veiculo {
	private int anoDeFabricacao;
	private String modelo;
	private String marca;
	
	//Construtor
	Veiculo (int ano, String model, String mar){
		anoDeFabricacao = ano;
		modelo = model;
		marca = mar;
	}

	//Devolver um valor que foi pedido por outra classe
	public int getAnoDeFabricacao() {
		return anoDeFabricacao;
	}

	//Trocar um valor atraves de outra classe
	public void setAnoDeFabricacao(int anoDeFabricacao) {
		this.anoDeFabricacao = anoDeFabricacao;
	}

	//Devolver um valor que foi pedido por outra classe
	public String getModelo() {
		return modelo;
	}
	
	//Trocar um valor atraves de outra classe
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	//Devolver um valor que foi pedido por outra classe
	public String getMarca() {
		return marca;
	}

	//Trocar um valor atraves de outra classe
	public void setMarca(String marca) {
		this.marca = marca;
	}

	
}
