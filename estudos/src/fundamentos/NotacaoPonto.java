package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		//Tipo não primitivo
		String s = "Bom dia X";
		
		//Notação ponto são os metodos
		s = s.replace("X", "Noki");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
	}
}
