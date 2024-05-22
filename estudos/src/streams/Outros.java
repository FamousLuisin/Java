package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Noc", 6);
		Aluno a2 = new Aluno("Noki", 7);
		Aluno a3 = new Aluno("Jhonson", 9);
		Aluno a4 = new Aluno("Noc", 6);
		Aluno a5 = new Aluno("Noki", 7);
		Aluno a6 = new Aluno("Jhonson", 9);
		Aluno a7 = new Aluno("Luisin", 4);

		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7);
		
		// Retirar duplicações
		alunos.stream()
			.distinct()
			.forEach(System.out::println);
		
		System.out.println();
		
		// skip: Pula alguns elementos da lista
		// limit: Faz um limite de quantos elemntos pegar
		alunos.stream()
			.distinct()
			.skip(1)
			.limit(2)
			.forEach(System.out::println);
	}
}
