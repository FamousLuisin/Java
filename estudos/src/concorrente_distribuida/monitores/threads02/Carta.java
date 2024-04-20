package concorrente_distribuida.monitores.threads02;

public class Carta {

	private String conteudo;
	private boolean enviada=false;
	
	Carta(String conteudo){
		this.conteudo = conteudo;
	}
	
	
	public boolean isEnviada() {
		return enviada;
	}
	
	public void setEnviada(boolean enviada) {
		this.enviada = enviada;
	}
	
	public String getConteudo() {
		return conteudo;
	}
	
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	
}
