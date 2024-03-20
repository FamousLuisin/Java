package classes.desafio;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.dia = 26;
		d1.mes = "Julho";
		d1.ano = 2001;
		
		var d2 = new Data(25, "Dezembro", 2023);

		Data d3 = new Data();
		
		System.out.printf(d1.obterData());
		System.out.println();
		d1.imprimirData();
		
		System.out.println();
		
		System.out.printf(d2.obterData());
		System.out.println();
		d2.imprimirData();
		
		System.out.println();
		
		System.out.printf(d3.obterData());
		System.out.println();
		d3.imprimirData();
		
	}
}
