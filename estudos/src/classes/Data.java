package classes;

public class Data {

	int dia;
	String mes;
	int ano;
	
	Data(){
		//dia = 1;
		//mes = "Janeiro";
		//ano = 1970;
		// Chamar um construtor por meio de outro construtor
		this(1, "Janeiro", 1970);
	}
	
	Data(int dia, String mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String obterData() {
		final String data = String.format("%d/%s/%d", this.dia, this.mes, this.ano);
		return data;
	}
	
	void imprimirData() {
		System.out.println(obterData());
	}
}
