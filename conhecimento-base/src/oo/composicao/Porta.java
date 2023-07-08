package oo.composicao;

public class Porta {
	
	Carro carro;
	String local;
	boolean aberta = false;
	
	Porta(String local) {
		this.local = local;
	}
	
	void abrirPorta() {
		aberta = true;
	}
	
	void fecharPorta() {
		aberta = false;
	}
	
	boolean estaAberta() {
		return aberta;
	}
}
