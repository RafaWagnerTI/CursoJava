package ti.wagner.rafa.cm.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import ti.wagner.rafa.cm.excecao.ExplosaoException;

public class Tabuleiro {

	private final int linhas;
	private final int colunas;
	private int minas;
	
	private final List<Campo> campos = new ArrayList<>(); 
	
	public Tabuleiro(int linhas, int colunas, int minas) {
		this.linhas = linhas;
		this.colunas = colunas;
		this.minas = minas;
		
		gerarCampos();
		associarVizinhos();
		sortearMinas();
	}
	
	public void abrir(int linha, int coluna) {
		try {
			campos.parallelStream()
				.filter(c -> c.getLinha() == linha &&
					c.getColuna() == coluna)
				.findFirst()
				.ifPresent(c -> c.abrir());
		} catch(ExplosaoException e) {
			campos.forEach(c -> c.setAberto(true));
			throw e;
		}
	}
	
	public void alternarMarcacao(int linha, int coluna) {
		campos.parallelStream()
			.filter(c -> c.getLinha() == linha &&
						 c.getColuna() == coluna)
			.findFirst()
			.ifPresent(c -> c.alternarMarcacao());
	}

	private void gerarCampos() {
		for (int linha = 0; linha < linhas; linha++) {
			for (int coluna = 0; coluna < colunas; coluna++) {
				campos.add(new Campo(linha, coluna));
			}
		}
	}
	
	private void associarVizinhos() {
		for (Campo c1: campos) {
			for (Campo c2: campos) {
				c1.adicionarVizinho(c2);
			}
		}
	}
	
	private void sortearMinas() {
		long minasArmadas = 0;
		Predicate<Campo> minado = c -> c.isMinado();
		
		do {
			int aleatorio = (int) (Math.random() * campos.size());
			campos.get(aleatorio).minar();
			minasArmadas = campos.stream().filter(minado).count();
		} while(minasArmadas < minas);
	}
	
	public boolean objetivoAlcancado() {
		return campos.stream().allMatch(c -> c.objetivoAlcancado());
	}
	
	public void reiniciar() {
		campos.forEach(c -> c.reiniciar());
		sortearMinas();
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("   ");
		for (int cabColuna = 0; cabColuna < colunas; cabColuna++) {
			sb.append("["+cabColuna+"]");
		}
		sb.append("\n");
		
		int i = 0;
		for (int linha = 0; linha < linhas; linha++) {
			sb.append("["+linha+"]");
			for (int coluna = 0; coluna < colunas; coluna++) {
				sb.append("[" + campos.get(i) + "]");
				i++;
			}
			sb.append("\n");
		}
		
		return sb.toString();
	}
	
	public List<Campo> getListaCampos() {
		return campos;
	}
	
	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}
	
}
