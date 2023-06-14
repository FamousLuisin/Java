package ClassesMetodos;

public class DataTeste {
	
	public static void main(String[] args) {
		Data meuAniversario = new Data();
		
		meuAniversario.dia = 26;
		meuAniversario.mes = 7;
		meuAniversario.ano = 2001;
		
		Data diaHoje = new Data(2, 6, 2023);
		
		Data diaInicial = new Data();
		
		System.out.println("=====Meu Aniversario=====");
		System.out.println(meuAniversario.obterData());
		
		System.out.println("=====Dia de Hoje=====");
		System.out.println(diaHoje.obterData());
		
		System.out.println("=====Dia Inicial=====");
		System.out.println(diaInicial.obterData());

	}
}
