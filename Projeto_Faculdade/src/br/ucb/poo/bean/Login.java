package br.ucb.poo.bean;

public class Login {
	String usuario;
	String senha;
	String codigoUsuario;
	
	public Login(String usuario, String senha, String codigoUsuario) {
		this.usuario = usuario;
		this.senha = senha;
		this.codigoUsuario = codigoUsuario;
	}
	
	@Override
	public String toString() {
		return usuario + " " + senha + " " + codigoUsuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(String codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}
}
