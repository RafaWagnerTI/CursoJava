package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	// Variáveis locais e constantes precisam ser inicializadas
	//de maneira explícita, até o momento de uso.
	
	Data() {
		//dia = 1;
		//mes = 1;
		//ano = 1970;
		this(1, 1, 1970); // Usado para chamar um construtor a partir de outro construtor da Classe
		//Um dos construtores precisa finalizar a criação do objeto.
	}
	
	Data(int dia, int mes, int ano) {
		this.dia = dia; // This aponta para a instância atual do objeto
		this.mes = mes;
		this.ano = ano;
	}
	
	protected String obterDataFormatada() {
		final String formato = "%d/%d/%d";
		return String.format(formato, this.dia, this.mes, this.ano);
	}
	
	protected void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
		
	}
}
