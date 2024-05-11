package generics;

import java.util.List;

public class ListaUtil {

	// Sem generics
	public static Object getUltimoValorSem(List<?> lista) {
		return lista.get(lista.size() - 1);
	}
	
	// Com generics
	public static <T> T getUltimoValorCom(List<T> lista) {
		return (T) lista.get(lista.size() - 1);
	}
}
