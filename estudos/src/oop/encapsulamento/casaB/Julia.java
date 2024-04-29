package oop.encapsulamento.casaB;

import oop.encapsulamento.casaA.Ana;

public class Julia {

	void testeAcessos() {		
		Ana sogra = new Ana();
		
		// System.out.println(mae.segredoPrivado);
		// System.out.println(mae.segredoPacote);
		// System.out.println(sogra.segredoProtegido);
		// System.out.println(sogra.segredoProtegido);
		System.out.println(sogra.semSegredo);
	}
}
