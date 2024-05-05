package tratamento_de_erro.personalizada;

public class TesteValidar {

	public static void main(String[] args) {
			Aluno aluno = new Aluno("Ana", 7);
			
			// Se quiser tratar as execeções de maneira individual
			// Deve ser feito outro bloco catch para tratar exceção por exceção
			try {
				Validar.usuario(aluno);
			} catch (StringVaziaException | NumeroForaIntervaloException e) {
				System.out.println(e.getMessage());
			}
			
			System.out.println("Validado");
	}
}
