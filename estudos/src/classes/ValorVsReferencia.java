package classes;

public class ValorVsReferencia {
	
	// Uma função static só pode acessar outra função static
	// Não tem como acessar um metodo de instancia dentro de um método statico
	public static void main(String[] args) {
		int a = 2;
		int b = a; // Atribuição por valor
		
		a++;
		b--;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println();
		
		Data d1 = new Data(26, "Julho", 2001);
		Data d2 = d1; //Atribuição por referencia
		
		d1.ano = 1966;
		d2.dia = 31;
		System.out.println(d1.obterData());
		System.out.println(d2.obterData());
		
		System.out.println();
		DataPadrao(d1);
		System.out.println(d1.obterData());
		System.out.println(d2.obterData());
	}
	
	// Função static só pode ser acessada por outra função static
	static void DataPadrao(Data d) {
		d.dia = 1;
		d.mes = "Janeiro";
		d.ano = 1970;
	}
}
