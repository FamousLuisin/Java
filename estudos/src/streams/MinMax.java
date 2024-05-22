package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Noc", 6);
		Aluno a2 = new Aluno("Noki", 7);
		Aluno a3 = new Aluno("Jhonson", 9);

		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3);
		
		// Função lambda de comparação
		Comparator<Aluno> melhorNota = (aluno1, aluno2) -> {
			if (aluno1.nota > aluno2.nota) return 1;
			if (aluno1.nota < aluno2.nota) return -1;
			return 0;
		};
		
		System.out.println(alunos.stream().max(melhorNota).get().nome);
		System.out.println(alunos.stream().min(melhorNota).get().nome);
	}
}
