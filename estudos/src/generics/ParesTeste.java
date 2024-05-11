package generics;

public class ParesTeste {

	public static void main(String[] args) {
		Pares<Integer, String> resultadoConcurso = new Pares<>();
		
		resultadoConcurso.adicionar(1, "Luis");
		resultadoConcurso.adicionar(2, "Noki");
		resultadoConcurso.adicionar(3, "Jhonson");
		resultadoConcurso.adicionar(4, "Luisin");
		resultadoConcurso.adicionar(2, "Noc");
		
		System.out.println(resultadoConcurso.getValor(1));
		System.out.println(resultadoConcurso.getValor(2));
	}
}
