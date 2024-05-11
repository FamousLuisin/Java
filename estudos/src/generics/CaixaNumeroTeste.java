package generics;

public class CaixaNumeroTeste {

	public static void main(String[] args) {
		CaixaNumero<Integer> caixaA = new CaixaNumero<>();
		caixaA.setCoisa(20);
		
		Integer coisaA = caixaA.getCoisa();
		System.out.println(coisaA);
		
		CaixaNumero<Double> caixaB = new CaixaNumero<>();
		caixaB.setCoisa(20.0);
		
		Double coisaB = caixaB.getCoisa();
		System.out.println(coisaB);
	}
}
