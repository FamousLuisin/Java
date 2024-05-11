package generics;

public class CaixaObjetoTeste {

	// Algoritmo SEM generics
	public static void main(String[] args) {
		CaixaObjeto caixaA= new CaixaObjeto();
		caixaA.setCoisa(2.3); // double -> Double
		
		// Integer coisa = (Integer) caixaA.getCoisa();
		Double coisaA = (Double) caixaA.getCoisa();
		System.out.println(coisaA);
		
		CaixaObjeto caixaB= new CaixaObjeto();
		caixaB.setCoisa("Olá"); 
		
		// Integer coisa = (Integer) caixaA.getCoisa();
		// Nos algoritmos SEM generics precisa afzer a conversão do valor
		String coisaB = (String) caixaB.getCoisa();
		System.out.println(coisaB);
	}
}
