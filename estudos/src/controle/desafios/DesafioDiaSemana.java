package controle.desafios;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o dia: ");
		String dia = entrada.next().toUpperCase();
		
		if (dia.equals("DOMINGO")) {
			System.out.println("Dia 1 da semana");
		}else if (dia.equals("SEGUNDA")) {
			System.out.println("Dia 2 da semana");
		}else if (dia.equals("TERÇA")) {
			System.out.println("Dia 3 da semana");
		}else if (dia.equals("QUARTA")) {
			System.out.println("Dia 4 da semana");
		}else if (dia.equals("QUINTA")) {
			System.out.println("Dia 5 da semana");
		}else if (dia.equals("SEXTA")) {
			System.out.println("Dia 6 da semana");
		}else if (dia.equals("SABADO")) {
			System.out.println("Dia 7 da semana");
		}else {
			System.out.println("Esse dia não existe");
		}
		
		
		
		entrada.close();
	}
}
