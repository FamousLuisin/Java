package teste.heranca;

import infra.DAO;
import modelo.heranca.Aluno;
import modelo.heranca.AlunoBolsista;

public class NovoAluno {

	public static void main(String[] args) {
		DAO<Aluno> alunoDAO = new DAO<>();
		
		Aluno aluno = new Aluno(2568L, "Noki");
		AlunoBolsista alunoBolsista = new AlunoBolsista(2548L, "Noc", 1000.0);
		
		alunoDAO.incluirAtomico(aluno);
		alunoDAO.incluirAtomico(alunoBolsista);
	}
}
