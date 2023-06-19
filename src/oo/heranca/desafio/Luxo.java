package oo.heranca.desafio;

public interface Luxo {

	void ligarAr();
	void desligarAr();
	
	//a tag default, faz com que o método retorne esse valor por padrão,
	// caso não seja implementado.
	default int velocidadeDoAr() {
		return 1;
	}
}
