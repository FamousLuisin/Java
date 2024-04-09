package arrays;

public class Equals {
	public static void main(String[] args) {
		User u1 = new User();
		u1.nome = "Noki";
		u1.email = "noki@email";
		
		User u2 = new User();
		u2.nome = "Noki";
		u2.email = "noki@email";
		
		User u3 = u1;
		
		// Comparando endereço de memória
		System.out.println("u1==u3: " + (u1 == u3));
		System.out.println("u1==u2: " + (u1 == u2));
		
		System.out.println();
		
		// Equals
		System.out.println("u1.equals(u3): " + u1.equals(u3));
		System.out.println("u1.equals(u2): " + u1.equals(u2));
		
		// Usando equals com outra classe
		// System.out.println(u2.equals(new Date()));
	}
}
