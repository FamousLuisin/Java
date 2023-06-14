package ClassesMetodos;

//objetos de classe sao incializados com valor null
public class Data {
	
	//atributos de instancia são inicializados com valor 0, false;
	int dia;
	int mes;
	int ano;
	
	Data(){
		//dia = 1;
		//mes = 1;
		//ano = 1970;
		
		//this como metedo so pode ser usado dentro de um constrautor e so chama outro contrutor;
		this(1, 1, 1970);
	}
	
	Data(int dia, int mes, int ano){
		//this é usado em métodos de instancia(não pode ser usado em metodos static)
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String obterData(){	
		return String.format("%d/%s/%d", dia, mes, ano);
	}
}
