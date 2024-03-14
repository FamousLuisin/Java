package fundamentos;

public class TiposString {

	public static void main(String[] args) {
		//charAt = pega o valor na posição n
		System.out.println("Olá pessoal".charAt(2));
		
		//ctrl + alt + down or up = duplicar linha
		//alt + down or up = mover linha
		String s = "Boa Noite";
		
		//concat = concatenar
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		
		//startWith =  começa com alguma coisa
		//endsWith =  termina com alguma coisa
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.startsWith("Bom"));
		System.out.println(s.endsWith("noite"));
		
		//length = tamanho da string
		System.out.println(s.length());
		
		//equals =  compração
		System.out.println(s.equals("boa noite"));
		System.out.println(s.equalsIgnoreCase("boa noite"));
		
		//String por inferencia
		var nome = "Pedro";
		var sobrenome = "Silva";
		var salario = 5_500.581;
		System.out.println(nome.toUpperCase()); 
		System.out.println("nome: " + nome + "\nSobrenome: " + sobrenome); 
		
		//printf = print formatado
		//%.2f = arredonda um valor
		System.out.printf("nome: %s %s ganha %.2f", nome, sobrenome, salario);
		
	}
}
