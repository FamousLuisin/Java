package fundamentos;

public class notacaoPonto {
	public static void main(String[] args) {

		String s = "Bom dia S";
		
		s = s.toUpperCase();
		System.out.println(s);
		
		s = s.replace("S", "Senhora");
		System.out.println(s);
		
		s = s.concat("!!!").toUpperCase();
		System.out.println(s);
		
		System.out.println("Leo".toLowerCase());
		
		String y = "Bom dia Y".replace("Y", "Gay").toUpperCase();
		
		System.out.println(y);
		
	}
}
