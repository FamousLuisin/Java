package oop.composicao;

public class AlunoTeste {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Noki");
		Aluno a2 = new Aluno("Noc");
		Aluno a3 = new Aluno("Jhonson");
		
		Curso c1 = new Curso("Java completo");
		Curso c2 = new Curso("Web 2023");
		Curso c3 = new Curso("React Native");
		
		c1.adicionarAluno(a1);
		c1.adicionarAluno(a2);
		
		c2.adicionarAluno(a1);
		c2.adicionarAluno(a3);
		
		a1.adicionarCurso(c3);
		a2.adicionarCurso(c3);
		a3.adicionarCurso(c3);
		
		System.out.println("========Cursos========");
		System.out.println(c1.alunos.size());
		System.out.println(c2.alunos.size());
		System.out.println(c3.alunos.size());
		
		System.out.println("========Alunos========");
		System.out.println(a1.cursos.size());
		System.out.println(a2.cursos.size());
		System.out.println(a3.cursos.size());
		
		System.out.println("======================");
		System.out.println(a1.cursos.get(0).alunos);
		System.out.println(a3.obterCursoPorNome("Web 2023").alunos);
		System.out.println("======================");
		
	}
}
