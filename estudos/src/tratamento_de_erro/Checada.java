package tratamento_de_erro;

public class Checada {

	public static void main(String[] args) {
		// Runtima não precisa ser tratada
		try {
			geraErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		// Throwable precisa ser tratada
		try {
			geraErro2();
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim");
	}
	
	// Execeção NÃO checada / verificada
	static void geraErro1() {
		// Lançar uma exceção não checada
		throw new RuntimeException("Erro 01");
	}
	
	// Exceção checada e vrificada (Lança uma exceção == throws Exception)
	static void geraErro2() throws Exception{
		// Lançar uma exceção (Ela pode ser tratada já nesse momento em que ela é lanÇADA)
		throw new Exception("Erro 02");
	}
}
