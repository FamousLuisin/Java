package POO;

public class Carro extends Veiculo {
	int cavalos;
	
	public String toString() {
		return "Carro " + getMarca() + " " + getModelo() + " fabricado em "  + getAnoDeFabricacao() + " com " + cavalos + " cavalos";
	}
	
	Carro(int ano, String modelo, String marca, int cavalos){
		super (ano, modelo, marca);
		this.cavalos = cavalos;
	}
	
	
	public static void main(String args[]) {
		Carro ford = new Carro(1990, "Mustang", "Ford", 150);
		System.out.println(ford);
		System.out.println(ford.getMarca());
	}
}
