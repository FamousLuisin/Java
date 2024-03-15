package fundamentos.desafios;

public class DesafioLogicos {

	public static void main(String[] args) {
		//Trabalho na terça (V ou F)
		//Trabalho de quinta (V ou F)
		
		boolean dia1 = false;
		boolean dia2 = false;
		
		boolean tv50 = dia1 && dia2;
		boolean tv32 = dia1 ^ dia2;
		boolean sorvete = dia1 || dia2;
		boolean nada = !dia1 && !dia2;
		
		System.out.println("Comprou tv 50? " + tv50);
		System.out.println("Comprou tv 32? " + tv32);
		System.out.println("Tomou sorvete? " + sorvete);
		System.out.println("Tristeza? " + nada);
	}
}
