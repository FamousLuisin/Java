package fundamentos.desafios;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		double parte1 = Math.pow(6*(3+2), 2);
		double parte2 = 3*2;
		double parte3 = ((1-5)*(2-7))/2;
		
		parte1 = parte1 / parte2;
		parte3 = Math.pow(parte3, 2);
		
		double parte4 = Math.pow(parte1 - parte3, 3) / Math.pow(10, 3);
			
		System.out.println(parte4);
	}
}
