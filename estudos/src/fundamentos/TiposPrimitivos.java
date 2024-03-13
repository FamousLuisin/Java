package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		//Info funcionario
		
		//Numericos inteiros
		byte anosDeEmpresa = 25;
		short numeroDeVoos = 525;
		int id = 57666;
		//Para atribuir um valor muito grande a um long deve-se colocar um L;
		long lucros = 3_766_544_059L;
		
		//Numerico com pontos flutuantes
		float salario = 11_445.57F;
		double vendasAcumuldas = 3_999_999_545.99;
		
		//Booleano
		boolean estaDeFerias = false;
		
		//Tipo caractere
		char status = 'A'; //Ativo
		
		//Dias de empresa
		System.out.println("Dias de empresa: " + anosDeEmpresa * 365);
		
		//Numero de viagens
		System.out.println("Numero de viagens: " + numeroDeVoos / 2);
		
		//Pontos real
		System.out.println(lucros / vendasAcumuldas);
		
		//Salario
		System.out.println("O usuario: " + id + " ganha -> " + salario);
		
		//Ferias
		System.out.println("Ferias? " + estaDeFerias);
		
		//Status na empresa
		System.out.println("Status atual: " + status);
	}
}
