package oop.composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	final String nome;
	// A lista (local de memória dela é constante), mas os elementos dela não
	final List<Aluno> alunos = new ArrayList<Aluno>();
	
	Curso(String nome){
		this.nome = nome;
	}
	
	void adicionarAluno(Aluno aluno){
		this.alunos.add(aluno);
		aluno.cursos.add(this);
	}
	
	public String toString() {
		return this.nome;
	}
}
