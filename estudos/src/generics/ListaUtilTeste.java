package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {

	public static void main(String[] args) {
		List<String> langs = Arrays.asList("JS", "PHP", "Java", "C++");
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
		
		// Cast / Conversão -> Já que não é generics
		String ultimaLinguagem = (String) ListaUtil.getUltimoValorSem(langs);
		Integer ultimaNum = (Integer) ListaUtil.getUltimoValorSem(nums);
		
		System.out.println(ultimaLinguagem);
		System.out.println(ultimaNum);
		
		// ================================================= //
		
		// Não precisa de Cast -> Já que é generics
		String ultimaLinguagemGenerics = ListaUtil.getUltimoValorCom(langs);
		// Especificando que tem q ser passado um valor do tipo Integer
		Integer ultimaNumGenerics = ListaUtil.<Integer>getUltimoValorCom(nums);
		
		System.out.println(ultimaLinguagemGenerics);
		System.out.println(ultimaNumGenerics);
	}
}
