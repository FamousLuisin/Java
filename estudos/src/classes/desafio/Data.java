package classes.desafio;

public class Data {

	int dia;
	String mes;
	int ano;
	
	Data(){
		dia = 1;
		mes = "Janeiro";
		ano = 1970;
	}
	
	Data(int diaInicial, String mesInicial, int anoInicial){
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
	}
	
	String obterData() {
		String data = String.format("%d/%s/%d", dia, mes, ano);
		return data;
	}
	
	void imprimirData() {
		System.out.println(obterData());
	}
}
