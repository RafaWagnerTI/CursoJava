package ti.wagner.rafa.cm.modelo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.function.Predicate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ti.wagner.rafa.cm.excecao.ExplosaoException;

public class TabuleiroTeste {

	private Tabuleiro tabuleiro;
	
	@BeforeEach
	void criarTabuleiro() {
		tabuleiro = new Tabuleiro(5, 5, 5);
	}

	@Test
	void testeGerouTodosCampos() {
		assertEquals(25, tabuleiro.getListaCampos().stream().count());
	}
	
	@Test
	void testeAssociacaoVizinhosCanto() {
		assertEquals(3, tabuleiro.getListaCampos().get(0).quantidadeVizinhos());
	}
	
	@Test
	void testeAssociacaoVizinhosLateral() {
		assertEquals(5, tabuleiro.getListaCampos().get(2).quantidadeVizinhos());
	}
	
	@Test
	void testeAssociacaoVizinhosCentro() {
		assertEquals(8, tabuleiro.getListaCampos().get(7).quantidadeVizinhos());
	}
	
	@Test
	void testeMinasSorteadas() {
		Predicate<Campo> minado = c -> c.isMinado();
		assertEquals(5, tabuleiro.getListaCampos().stream().filter(minado).count());
	}
	
	@Test
	void testeMarcarCampo() {
		tabuleiro.alternarMarcacao(2, 2);
		Predicate<Campo> marcado = c -> c.isMarcado();
		assertTrue(tabuleiro.getListaCampos().stream().anyMatch(marcado));
	}
	
	@Test
	void testeAbrirCampo() {
		try {
			tabuleiro.abrir(2, 2);
		} catch(ExplosaoException e) {
			
		}
		Predicate<Campo> aberto = c -> c.isAberto();
		assertTrue(tabuleiro.getListaCampos().stream().anyMatch(aberto));
	}
	
	@Test
	void testeObjetivoConcluido() {
		tabuleiro.getListaCampos().stream().filter(c -> c.isMinado()).forEach(c -> c.alternarMarcacao());
		tabuleiro.getListaCampos().parallelStream().filter(c -> c.isSeguro() 
				&& c.isDesmarcado() && c.isFechado()).forEach(c -> c.abrir());
		assertTrue(tabuleiro.objetivoAlcancado());
	}
	
	@Test
	void testeReiniciarJogo() {
		tabuleiro.getListaCampos().stream().filter(c -> c.isMinado()).forEach(c -> c.alternarMarcacao());
		tabuleiro.getListaCampos().parallelStream().filter(c -> c.isSeguro() 
				&& c.isDesmarcado() && c.isFechado()).forEach(c -> c.abrir());
		tabuleiro.reiniciar();
		assertTrue(tabuleiro.getListaCampos().stream().allMatch(c -> c.isFechado()));
	}
	
	@Test
	void testeQuantidadeLinhas() {
		assertEquals(5, tabuleiro.getLinhas());
	}
	
	@Test
	void testeQuantidadeColunas() {
		assertEquals(5, tabuleiro.getColunas());
	}
}
