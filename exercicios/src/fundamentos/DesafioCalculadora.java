package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double num1;
		double num2;
		String operador;
		double resultado = 0;
		
		System.out.println("Digite o primeiro numero: ");
		num1 = entrada.nextDouble();
		
		System.out.println("Digite o segundo numero: ");
		num2 = entrada.nextDouble();
		
		entrada.nextLine();
		
		System.out.println("Qual operacao voce deseja? [+ - * / %]");
		operador = entrada.nextLine();
		
		resultado = "+".equals(operador) ? num1 + num2 : resultado;
		resultado = "-".equals(operador) ? num1 - num2 : resultado;
		resultado = "*".equals(operador) ? num1 * num2 : resultado;
		resultado = "/".equals(operador) ? num1 / num2 : resultado;
		resultado = "%".equals(operador) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, operador, num2, resultado);
		
		
		
		entrada.close();
	}
}
