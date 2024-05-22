package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Noc", 7);
		Aluno a2 = new Aluno("Noki", 7);
		Aluno a3 = new Aluno("Jhonso", 9);
		Aluno a4 = new Aluno("Jojo", 5);
		Aluno a5 = new Aluno("Jhonny", 5);
		Aluno a6 = new Aluno("Luis", 7);
		Aluno a7 = new Aluno("Luisin", 8);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		
		Function<Aluno, Double> nota = a -> a.nota;
		
		BinaryOperator<Double> somatorio = (a, b) -> a + b;
		
		alunos.stream()
			.filter(aprovado)
			.map(nota)
			.reduce(somatorio)
			.ifPresent(System.out::println);
	}
}
