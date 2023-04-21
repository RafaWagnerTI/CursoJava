package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<String>();
		
		//Push e Add -> Adicionam elementos na pilha
		//Diferença é o comportamento que ocorre quando a pilha está cheia
		
		livros.add("O Pequeno Príncipe"); // Dispara uma exceção quando a pilha está cheia
		livros.push("Don Quixote"); // Retorna false
		livros.push("O Hobbit");
		
		//Peek e Element - Ambos olham qual o primeiro elemento da pilha
		//Diferença é o comportamento que ocorre quando a pilha está vazia
		
		System.out.println(livros.peek()); // Retorna null
		System.out.println(livros.element()); // Dispara uma exceção quando a pilha está vazia
		
		System.out.println("\nLivros da Pilha: ");
		for(String livro: livros) {
			System.out.println(livro);
		}
		System.out.println("===\n");
		
		//Poll e Pop - Remove o elemento da pilha, retornando ele no resultado
		//Diferença é o comportamento quando a pilha está vazia
		
		System.out.println(livros.pop()); //  Dispara uma exceção quando a pilha está vazia
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll()); // Retorna null
		
		//livros.size(); // Retorna quantos elementos tem na pilha
		//livros.clear(); // Limpa a pilha
		//livros.contains(); //Valida se a pilha está vazia
		//livros.isEmpty(); //Valida se o elemento está na pilha
	}
	
}
