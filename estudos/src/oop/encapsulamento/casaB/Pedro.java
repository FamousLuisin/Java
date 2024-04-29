package oop.encapsulamento.casaB;

import oop.encapsulamento.casaA.Ana;

public class Pedro extends Ana{
	
	void testeAcessos() {		
		// System.out.println(mae.segredoPrivado);
		// System.out.println(mae.segredoPacote);
		System.out.println(super.segredoProtegido);
		System.out.println(segredoProtegido);
		System.out.println(semSegredo);
	}
}
