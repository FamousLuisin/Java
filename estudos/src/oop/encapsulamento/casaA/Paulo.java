package oop.encapsulamento.casaA;

public class Paulo {

	void testeAcessos() {
		Ana esposa = new Ana();
		
		// System.out.println(esposa.segredoPrivado);
		System.out.println(esposa.segredoPacote);
		System.out.println(esposa.segredoProtegido);
		System.out.println(esposa.semSegredo);
	}
}
