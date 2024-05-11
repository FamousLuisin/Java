package generics;

public class CaixaTeste {

	// algoritmo COM generics
	// Atrasar a definição de alguns tipos
	public static void main(String[] args) {
		
		// Aqui vc define o tipo generico usado
		// O tipo é definido no momento que instancia o objeto
		Caixa<String> caixaA = new Caixa<>();
		caixaA.setCoisa("Olá");
		
		// Não é necessario fazer a conversão do valor
		String coisaA = caixaA.getCoisa();
		System.out.println(coisaA);
		
		Caixa<Integer> caixaB = new Caixa<>();
		caixaB.setCoisa(10);
		
		Integer coisaB = caixaB.getCoisa();
		System.out.println(coisaB);
	}
}
