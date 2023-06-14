package br.ucb.poo.bean;

public class Usuario {
	private String nome;
	private String cpf;
	private int tipoUsuario; 
	private String codigo;
	
	Usuario(String nome, String cpf, int tipoUsuario, String codigo){
		this.nome = nome;
		this.cpf = cpf;
		this.tipoUsuario = tipoUsuario;
		this.codigo = codigo;
	}
	
	@Override
	public String toString() {
		return nome + " " + cpf + " " + tipoUsuario + " " + codigo + "\n";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(int tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
}
