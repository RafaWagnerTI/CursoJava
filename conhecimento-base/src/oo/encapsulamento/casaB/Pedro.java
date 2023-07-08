package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

	void testeAcessos() {
		//Ana mae = new Ana(); -> Não consegue acessar os metodos por instância da Ana.
		//System.out.println(mae.segredo);
		//System.out.println(facoDentroDeCasa);
		System.out.println(formaDeFalar);
		System.out.println(todosSabem);
		System.out.println(new Ana().todosSabem); // por ser public, esse atributo pode ser acessado assim.
	}
	
}
