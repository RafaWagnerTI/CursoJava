package controle.exercicios;

import java.util.Random;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		/*
		 * Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene um numero aleatório em uma variável. 
		 * O Jogador tem 10 tentativas para adivinhar o número gerado. Ao final de cada tentativa, imprima a quantidade 
		 * de tentativas restantes, e imprima se o número inserido é maior ou menor do que o número armazenado.
		 */
		Random numero = new Random();
		Scanner teclado = new Scanner(System.in);
		int numeroAleatorio = 1;
		int numeroDigitado = 0;
		int tentativas = 10;
		numeroAleatorio += numero.nextInt(100);
		
		while(numeroAleatorio != numeroDigitado && tentativas > 0) {
			System.out.printf("Digite um número de 1 a 100, você tem %d tentativas: ", tentativas);
			numeroDigitado = teclado.nextInt();
			
			if(numeroDigitado > 0 && numeroDigitado < 101) {
				if(numeroDigitado == numeroAleatorio) {
					System.out.printf("Acertou, o número sorteado foi %d%n", numeroAleatorio);
				} else {
					tentativas--;
					if(numeroDigitado < numeroAleatorio)
						System.out.printf("%d é menor que o número sorteado.%n", numeroDigitado);
					else System.out.printf("%d é maior que o número sorteado.%n", numeroDigitado);
				}
			}
		}
		
		if(tentativas == 0)
			System.out.printf("Fim de jogo, o número sorteado era %d", numeroAleatorio);
		
		teclado.close();
	}
}
