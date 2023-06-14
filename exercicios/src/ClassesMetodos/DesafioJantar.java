package ClassesMetodos;

public class DesafioJantar {
	public static void main(String[] args) {
		System.out.println("=====INICIAL=====");
		DesafioPessoa p1 = new DesafioPessoa("Joao", 55);
		System.out.println(p1.info());
		
		System.out.println("=====JANTAR=====");
		DesafioComida c1 = new DesafioComida("Feijoada", 0.850);
		p1.comer(c1);
		System.out.println(p1.info());
		
		System.out.println("=====JANTAR=====");
		DesafioComida c2 = new DesafioComida("Bife", 0.500);
		p1.comer(c2);
		System.out.printf("nome: %s \npeso: %.2f", p1.nome, p1.peso);
	}
}
