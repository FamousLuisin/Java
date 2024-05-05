package tratamento_de_erro.personalizada;

public class Validar {

	private Validar() {
		
	}
	
	public static void usuario(Aluno aluno) {
		if(aluno == null) {
			throw new IllegalArgumentException("O aluno está nulo!");
		}
		
		if(aluno.getNome() == null || aluno.getNome().trim().isEmpty()) {
			throw new StringVaziaException("nome");
		}
		
		if(aluno.getIdade() < 0 || aluno.getIdade()> 20) {
			throw new NumeroForaIntervaloException("idade");
		}
	}
}
