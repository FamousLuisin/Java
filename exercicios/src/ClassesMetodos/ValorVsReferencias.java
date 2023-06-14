package ClassesMetodos;

public class ValorVsReferencias {
	
	public static void main(String[] args) {
		//Atribuição por valor (primitivo)
		double a = 2;
		double b = a;
		
		a++;
		b--;
		System.out.println(a + " - " + b);
		
		//Atribuição por referencia (objeto)
		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1;
		
		d1.dia = 31;
		d2.ano = 2050;
		System.out.println(d1.obterData() + " - " + d2.obterData());
		
		voltarDataParaValorPadrao(d1);
		
		System.out.println(d1.obterData() + " - " + d2.obterData());
	}
	
	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
}
