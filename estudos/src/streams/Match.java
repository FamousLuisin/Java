package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Noc", 6);
		Aluno a2 = new Aluno("Noki", 7);
		Aluno a3 = new Aluno("Jhonso", 6);

		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		
		// Todos alunos foram aprovados?
		System.out.println(alunos.stream().allMatch(aprovado));
		
		// Algum aluno foi aprovado?
		System.out.println(alunos.stream().anyMatch(aprovado));
		
		// Todos alunos foram reporvados?
		System.out.println(alunos.stream().noneMatch(aprovado));
	}
}
