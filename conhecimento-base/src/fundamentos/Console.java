package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia!\n\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);
		System.out.printf("Salário: %.1f%n", 1234.5678);
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Digite a sua idade: ");
		int idade = entrada.nextInt();
		entrada.nextLine(); // Porque essa linha?
		
		/*
		 * Acontece que o scanner do nextInt le a informação até encontrar um \n,
		 * porém, como aceita apenas números ele deixa o \n que encontrou para trás.
		 * Quando lê a próxima pergunta ele já encontra o \n que sobrou logo de cara e pula ela.
		 * Portanto, para resolver é possível colocar um scanner.nextLine() logo após um nextInt()
		 * ou nextDouble(), assim ele le o \n armazenado antes de iniciar a próxima pergunta
		 * */
		
		System.out.println("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade);
		
		entrada.close();
	}
}
