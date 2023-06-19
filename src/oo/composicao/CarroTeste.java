package oo.composicao;

public class CarroTeste {
	
	public static void main(String[] args) {
		Carro c1 = new Carro();
		System.out.println(c1.estaLigado());
		
		c1.adicionarPorta("Dianteira Esquerda");
		c1.adicionarPorta("Dianteira Direita");
		c1.adicionarPorta("Traseira Esquerda");
		c1.adicionarPorta("Traseira Direita");
		
		c1.portas.get(0).abrirPorta();
		c1.portas.get(1).abrirPorta();
		
		c1.ligar();
		System.out.println(c1.estaLigado());
		
		System.out.println(c1.motor.giros());
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		
		System.out.println(c1.motor.giros());
		
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		
		//Faltou Encapsulamento
		//c1.motor.fatorInjecao = -30;
		
		System.out.println(c1.motor.giros());
		
		//Relação Bidirecional
		System.out.println(c1.motor.carro.motor.carro.motor.carro.motor.giros());
	}
	
}
