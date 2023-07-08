package oo.heranca.teste;

import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.Fusca;

public class Pista {

	public static void main(String[] args) {
		Fusca fus = new Fusca();
		Ferrari fer = new Ferrari();
		
		fer.ligarTurbo();
		fer.ligarAr();
		System.out.println("A velocidade do Ar da Ferrari é: " + fer.velocidadeDoAr());
		
		System.out.println("====================");
		
		System.out.println("O Fusca acelerou e sua velocidade atual é: " + fus.acelerar());
		System.out.println("O Fusca freou e sua velocidade atual é : " + fus.frear());
		System.out.println("O Fusca freou e sua velocidade atual é : " + fus.frear());
		System.out.println("O Fusca freou e sua velocidade atual é : " + fus.frear());
		
		System.out.println("====================");
		
		System.out.println("A Ferrari acelerou e sua velocidade atual é: " + fer.acelerar());
		System.out.println("A Ferrari freou e sua velocidade atual é: " + fer.frear());
		System.out.println("A Ferrari freou e sua velocidade atual é: " + fer.frear());
		System.out.println("A Ferrari freou e sua velocidade atual é: " + fer.frear());
		System.out.println("A Ferrari freou e sua velocidade atual é: " + fer.frear());
		
		System.out.println("====================");
		
		System.out.println("O Fusca acelerou e sua velocidade atual é: " + fus.acelerar());
		System.out.println("O Fusca acelerou e sua velocidade atual é: " + fus.acelerar());
		System.out.println("O Fusca acelerou e sua velocidade atual é: " + fus.acelerar());
		System.out.println("O Fusca acelerou e sua velocidade atual é: " + fus.acelerar());
		System.out.println("O Fusca acelerou e sua velocidade atual é: " + fus.acelerar());
		System.out.println("O Fusca acelerou e sua velocidade atual é: " + fus.acelerar());
		System.out.println("O Fusca acelerou e sua velocidade atual é: " + fus.acelerar());
		
		System.out.println("====================");
		
		System.out.println("A Ferrari acelerou e sua velocidade atual é: " + fer.acelerar());
		System.out.println("A Ferrari acelerou e sua velocidade atual é: " + fer.acelerar());
		System.out.println("A Ferrari acelerou e sua velocidade atual é: " + fer.acelerar());
		System.out.println("A Ferrari acelerou e sua velocidade atual é: " + fer.acelerar());
		System.out.println("A Ferrari acelerou e sua velocidade atual é: " + fer.acelerar());
		System.out.println("A Ferrari acelerou e sua velocidade atual é: " + fer.acelerar());
		System.out.println("A Ferrari acelerou e sua velocidade atual é: " + fer.acelerar());
		System.out.println("A Ferrari acelerou e sua velocidade atual é: " + fer.acelerar());
		
		fer.desligarTurbo();
		fer.desligarAr();
	}
	
}
