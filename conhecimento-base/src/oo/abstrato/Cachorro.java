package oo.abstrato;

public class Cachorro extends Mamifero {

	@Override
	public String mamar() {
		return "Usando leite";
	}

	@Override //Métodos finais não podem ser sobrescritos em subclasses
	public final String mover() {
		return "Usando as patas";
	}
	
}
