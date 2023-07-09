package ti.wagner.rafa.cm.visao;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import ti.wagner.rafa.cm.excecao.AlemDoTabuleiroException;
import ti.wagner.rafa.cm.excecao.ExplosaoException;
import ti.wagner.rafa.cm.excecao.SairException;
import ti.wagner.rafa.cm.modelo.Tabuleiro;

public class TabuleiroConsole {

	private Tabuleiro tabuleiro;
	private Scanner entrada = new Scanner(System.in);
	
	public TabuleiroConsole(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		
		executarJogo();
	}
	
	private void executarJogo() {
		try {
			boolean continuar = true;
			while(continuar) {
				System.out.println("Iniciando novo jogo...");
				cicloDoJogo();
				
				System.out.println("Outra partida? (S/n)");
				String resposta = entrada.nextLine();
				
				if("n".equalsIgnoreCase(resposta) || "sair".equalsIgnoreCase(resposta)) {
					continuar = false;
				} else {
					tabuleiro.reiniciar();
				}
			}
		} catch (SairException e) {
		} finally {
			System.out.println("Tchau!!");
			entrada.close();
		}
	}

	private void cicloDoJogo() {
		try {
			int[] coordenadas = null;
			while(!tabuleiro.objetivoAlcancado()) {
				System.out.println(tabuleiro);
				String digitado = ""; 
				
				if(coordenadas == null) {
					digitado = capturarValorDigitado("Digite (Linha, Coluna): ").trim();
					coordenadas = getCoordenadas(digitado);

				}
				
				if(coordenadas != null) {
					digitado = capturarValorDigitado("1 - Abrir ou 2 - (Des)Marcar").trim();
					executarAcaoDeCoord(digitado, coordenadas[0], coordenadas[1]);
					coordenadas = null;
				}

			}
			System.out.println("Você ganhou!!!");
		} catch(ExplosaoException e) {
			System.out.println("Você perdeu!!!");
		} finally {
			System.out.println(tabuleiro);	
		}
	}
	
	private String capturarValorDigitado(String texto) {
		System.out.println(texto);
		String digitado = entrada.nextLine();
		
		if("sair".equalsIgnoreCase(digitado)) {
			throw new SairException();
		}
		
		return digitado;
	}
	
	private int[] getCoordenadas(String digitado) {
		try {
			List<Integer> coordenadas = Arrays.stream(digitado.split(","))
					.map(Integer::parseInt)
					.collect(Collectors.toList());
		
			int coordLinha = Math.abs(coordenadas.get(0));
			int coordColuna = Math.abs(coordenadas.get(1));
		
			if(coordLinha >= tabuleiro.getLinhas() ||
			   coordColuna >= tabuleiro.getColunas())
				throw new AlemDoTabuleiroException();
		
			return new int[] {coordLinha, coordColuna};

		} catch(NumberFormatException e) {
			System.out.println("Coordenada inválida, digite novamente!");
		} catch(AlemDoTabuleiroException e) {
			System.out.println("Coordenada maior do que o esperado, digite novamente!");
		} catch(IndexOutOfBoundsException e) {
			System.out.println("Você precisa digitar apenas os valores de Linha e Coluna, digite novamente!");
		}
		return null;
	}
	
	private void executarAcaoDeCoord(String digitado, int linhaCoord, int colunaCoord) {
		try {
			if(Integer.parseInt(digitado.trim()) >= 1 &&
			   Integer.parseInt(digitado.trim()) <= 2) {
				if("1".equals(digitado)) {
					tabuleiro.abrir(linhaCoord, colunaCoord);
				} else if("2".equals(digitado)) {
					tabuleiro.alternarMarcacao(linhaCoord, colunaCoord);
				}
			} else System.out.println("Valor digitado é inválido, digire novamente!");
		} catch(NumberFormatException e) {
			System.out.println("Opção inválida, digite novamente");
		}
	}
}
