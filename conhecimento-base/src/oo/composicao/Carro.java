package oo.composicao;

import java.util.ArrayList;

public class Carro {

	final Motor motor;
	ArrayList<Porta> portas = new ArrayList<Porta>();
	
	Carro() {
		this.motor = new Motor(this);
	}
	
	void adicionarPorta(String local) {
		this.adicionarPorta(new Porta(local));
	}
	
	void adicionarPorta(Porta porta) {
		portas.add(porta);
		porta.carro = this;
	}
	
	boolean validaPortasAbertas() {
		boolean portaAberta = false;
		for(Porta p : portas) {
			portaAberta = portaAberta || p.estaAberta();
		}
		return portaAberta;
	}
	
	void informaPortasAbertas() {
		String s = "ATENÇÃO: A(s) porta(s) ";
		for(Porta p : portas) {
			if(p.estaAberta())
				s += p.local + ", ";
		}
		s = s.substring(0, s.length()-2) + " ";
		s += "esta(ão) aberta(s), verifique!";
		System.out.println(s);
	}
	
	void acelerar() {
		if(!validaPortasAbertas()) {
			if(motor.fatorInjecao < 2.6) {
				motor.fatorInjecao += 0.4;
			}
		} else informaPortasAbertas();
	}
	
	void frear() {
		if(motor.fatorInjecao > 0.5) {
			motor.fatorInjecao -= 0.4;
		}
	}
	
	void ligar() {
		motor.ligado = true;
	}
	
	void desligar() {
		motor.ligado = false;
	}
	
	boolean estaLigado() {
		return motor.ligado;
	}
	
}
