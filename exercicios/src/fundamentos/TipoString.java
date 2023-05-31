package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		System.out.println("Bom dia".charAt(0));
		
		String s = "Boa Tarde";
		
		//concatenar
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		
		//Analisar se a String começa ou termina com uma determinada letra ou palavra
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.endsWith("Boa"));
		
		//Quantidade de caracteres
		System.out.println(s.length());
		
		//Analisar uma palavra se ela é igual a outra
		System.out.println(s.equals("Boa tarde"));
		System.out.println(s.equalsIgnoreCase("Boa Tarde"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12_500.99F;
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nidade: " + idade + "\nsalario: " + salario);
		
		System.out.printf("nome: %s %s tem %d anos e ganha R$%.2f", nome, sobrenome, idade, salario);
		
		String frase = String.format("\nnome: %s %s tem %d anos e ganha R$%.2f", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		//Contem a palavra?
		System.out.println("Frase qualquer".contains("qual"));
		
		//Aonde começa uma palavra
		System.out.println("Frase qualquer".indexOf("qual"));
		
		//Mostra tudo apartir do valor solicitado até um outro valor
		System.out.println("Frase qualquer".substring(6, 10));
	}
}
