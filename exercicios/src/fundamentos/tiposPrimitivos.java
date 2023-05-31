package fundamentos;

public class tiposPrimitivos {
	public void main(String[] args) {
		//Inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		//Ponto flutuante
		float salario = 1.44F;
		double vendasAcumuladas = 2_991_797_103.05;
		
		//booleano
		boolean estaDeFerias = true;
		
		//caracter
		char status = 'A';
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//numero de viagens
		System.out.println(numeroDeVoos/2);
		
		//Ponto por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + "ganha -> " + salario);
		System.out.println("Ferias? " + estaDeFerias);
		
		System.out.println("Status: " + status);
	}
}
