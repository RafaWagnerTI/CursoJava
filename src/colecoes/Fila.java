package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		//Offer e Add -> Adicionam elementos na fila
		//Diferença é o comportamento que ocorre quando a fila está cheia
		
		fila.add("Ana"); // Dispara uma exceção quando a fila está cheia
		fila.offer("Bia"); // Retorna false
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafael");
		fila.offer("Gui");
		
		//Peek e Element - Ambos olham qual o primeiro elemento da fila
		//Diferença é o comportamento que ocorre quando a fila está vazia
		
		System.out.println(fila.peek()); // Retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element()); // Dispara uma exceção quando a fila está vazia
		System.out.println(fila.element());
		
		//Poll e Remove - Remove o elemento da fila, retornando ele no resultado
		//Diferença é o comportamento quando a fila está vazia
		
		System.out.println(fila.remove()); //  Dispara uma exceção quando a fila está vazia
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll()); // Retorna null
		
		//fila.size(); // Retorna quantos elementos tem na fila
		//fila.clear(); // Limpa a fila
		//fila.isEmpty(); //Valida se a fila está vazia
		//fila.contains(); //Valida se o elemento está na fila
		
		
		
		
	}
	
}
