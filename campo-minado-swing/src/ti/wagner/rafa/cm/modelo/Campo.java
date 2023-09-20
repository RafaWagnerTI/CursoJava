package ti.wagner.rafa.cm.modelo;

import java.util.ArrayList;
import java.util.List;

public class Campo {

	private final int linha;
	private final int coluna;
	
	private boolean aberto = false;
	private boolean minado = false;
	private boolean marcado = false;
	
	private static final String ANSI_RESET = "\u001B[0m";
	private static final String ANSI_RED = "\u001B[31m";
	private static final String ANSI_GREEN = "\u001B[32m";
	private static final String ANSI_YELLOW = "\u001B[33m";
	private static final String ANSI_BLUE = "\u001B[34m";
	private static final String ANSI_PURPLE = "\u001B[35m";
	private static final String ANSI_CYAN = "\u001B[36m";
	private static final String ANSI_BLACK = "\u001B[30m";
	
	private List<Campo> vizinhos = new ArrayList<>();
	
	Campo(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
	}
	
	boolean adicionarVizinho(Campo candidatoVizinho) {
		boolean linhaDiferente = linha != candidatoVizinho.linha;
		boolean colunaDiferente = coluna != candidatoVizinho.coluna;
		boolean diagonal = linhaDiferente && colunaDiferente;
		
		int deltaLinha = Math.abs(linha - candidatoVizinho.linha);
		int deltaColuna = Math.abs(coluna - candidatoVizinho.coluna);
		int deltaGeral = deltaColuna + deltaLinha;
				
		if(deltaGeral == 1 && !diagonal) {
			vizinhos.add(candidatoVizinho);
			return true;
		} else if(deltaGeral == 2  && diagonal) {
			vizinhos.add(candidatoVizinho);
			return true;
		} else {
			return false;
		}
	}
	
	void alternarMarcacao() {
		if(!aberto) {
			marcado = !marcado;
		}
	}
	
	boolean abrir() {
		
		if(!aberto && !marcado) {
			aberto = true;
			
			if(minado) {
				// TODO implementar nova versão
			}
			
			if(vizinhancaSegura()) {
				vizinhos.forEach(v -> v.abrir());
			}
			
			return true;
		} else {
			return false;
		}
	}
	
	boolean vizinhancaSegura() {
		return vizinhos.stream().noneMatch(c -> c.minado);
	}
	
	public boolean isMinado() {
		return minado;
	}
	
	public boolean isSeguro() {
		return !isMinado();
	}
	
	
	public boolean isMarcado() {
		return marcado;
	}
	
	public boolean isDesmarcado() {
		return !isMarcado();
	}
	
	void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	
	public boolean isAberto() {
		return aberto;
	}
	
	public boolean isFechado() {
		return !isAberto();
	}
	
	void minar() {
		minado = true;
	}

	public int getLinha() {
		return linha;
	}

	public int getColuna() {
		return coluna;
	}
	
	boolean objetivoAlcancado() {
		boolean desvendado = !minado && aberto;
		boolean protegido = minado && marcado;
		return desvendado || protegido;
	}
	
	long minasNaVizinhanca() {
		return vizinhos.stream().filter(v -> v.minado).count();
	}
	
	void reiniciar() {
		aberto = false;
		minado = false;
		marcado = false;
	}
	
	public String toString() {
		if(marcado) {
			return ANSI_BLACK + "x" + ANSI_RESET;
		} else if(aberto && minado) {
			return "*";
		} else if(aberto && minasNaVizinhanca() > 0) {
			int minasNaVizinhanca = Integer.parseInt(Long.toString(minasNaVizinhanca()));
			switch(minasNaVizinhanca) {
				case 1: return ANSI_RED + minasNaVizinhanca + ANSI_RESET;
				case 2: return ANSI_GREEN + minasNaVizinhanca + ANSI_RESET;
				case 3: return ANSI_BLUE + minasNaVizinhanca + ANSI_RESET;
				case 4: return ANSI_YELLOW + minasNaVizinhanca + ANSI_RESET;
				case 5: return ANSI_PURPLE + minasNaVizinhanca + ANSI_RESET;
				case 6: return ANSI_CYAN + minasNaVizinhanca + ANSI_RESET;
				case 7: return ANSI_RED + minasNaVizinhanca + ANSI_RESET;
				case 8: return ANSI_PURPLE + minasNaVizinhanca + ANSI_RESET;
				default: return Long.toString(minasNaVizinhanca());
			}
		} else if(aberto) {
			return " ";
		} else return "?";
		
	}
	
	public long quantidadeVizinhos() {
		return vizinhos.stream().count();
	}
}
