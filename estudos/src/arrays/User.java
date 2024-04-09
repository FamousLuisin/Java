package arrays;

public class User {
	
	String nome;
	String email;
	
	public boolean equals(Object objeto) {
		
		// Está vendo se aquela objeto recebido é uma instancia de User
		if (objeto instanceof User) {
			User outro = (User) objeto;
			boolean nomeIgual = this.nome.equals(outro.nome);
			boolean emailIgual = this.email.equals(outro.email);
			
			return nomeIgual && emailIgual;
		}
		
		
		
		return false;
	}
}
