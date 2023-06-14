package ClassesMetodos;

public class DesafioPessoa {
	String nome;
	double peso;
	
	DesafioPessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	void comer(DesafioComida comida){
		peso += comida.calorias;
	}
	
	String info(){
		String formatado = "nome: " + nome + "\npeso: " + peso;
		return formatado;
	}
}
