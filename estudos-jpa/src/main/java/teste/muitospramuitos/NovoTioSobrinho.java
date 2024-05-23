package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Sobrinho;
import modelo.muitospramuitos.Tio;

public class NovoTioSobrinho {

	public static void main(String[] args) {
		
		Tio tio1 = new Tio("José");
		Tio tia2 = new Tio("Maria");
		
		Sobrinho sobrinho1 = new Sobrinho("Renatinho");
		Sobrinho sobrinha2 = new Sobrinho("Renatinha");
		
		tia2.getSobrinhos().add(sobrinho1);
		sobrinho1.getTios().add(tia2);
		
		tia2.getSobrinhos().add(sobrinha2);
		sobrinha2.getTios().add(tia2);
		
		tio1.getSobrinhos().add(sobrinho1);
		sobrinho1.getTios().add(tio1);
		
		tio1.getSobrinhos().add(sobrinha2);
		sobrinha2.getTios().add(tio1);
		
		DAO<Object> dao = new DAO<>();
		dao.abrirT()
			.incluir(tio1)
			.incluir(tia2)
			.incluir(sobrinho1)
			.incluir(sobrinha2)
			.fecharT()
			.fechar();
	}
}
