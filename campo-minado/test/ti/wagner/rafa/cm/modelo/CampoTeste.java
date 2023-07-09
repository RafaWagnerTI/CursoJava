package ti.wagner.rafa.cm.modelo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ti.wagner.rafa.cm.excecao.ExplosaoException;

public class CampoTeste {

	private Campo campo;
	
	@BeforeEach
	void criarCampo() {
		campo = new Campo(3, 3);
	}
	
	@Test
	void testeVizinhos() {
		
		List<Campo> vizinhos = Arrays.asList(new Campo(3, 2),
				new Campo(3,4), new Campo(2, 3), new Campo(4, 3),
				new Campo(2,2), new Campo(2,4), new Campo(4, 2), 
				new Campo(4, 4));
		
		
		assertTrue(vizinhos.stream().allMatch(c -> campo.adicionarVizinho(c)));
	}
	
	@Test
	void testeNaoVizinho() {
		List<Campo> naoVizinho = Arrays.asList(new Campo(1,1),
				new Campo(1,2), new Campo(1,3), new Campo(1,4),
				new Campo(1,5), new Campo(2,5), new Campo(3,5),
				new Campo(4,5), new Campo(5,5), new Campo(5,4),
				new Campo(5,3), new Campo(5,2), new Campo(5,1),
				new Campo(4,1), new Campo(3,1), new Campo(2,1));
		
		boolean resultado = true;
		for(Campo c : naoVizinho)
			resultado = resultado && campo.adicionarVizinho(c);
		
		assertFalse(resultado);
	}
	
	@Test
	void testeValorPadraoAtributoMarcado() {
		assertFalse(campo.isMarcado());
	}
	
	@Test
	void testeAlternarMarcacao() {
		campo.alternarMarcacao();
		assertTrue(campo.isMarcado());
	}
	
	@Test
	void testeAlternarMarcacaoDuasChamadas() {
		campo.alternarMarcacao();
		campo.alternarMarcacao();
		assertFalse(campo.isMarcado());
	}
	
	@Test
	void testarAbrirCampoNaoMinadoNaoMarcado() {
		assertTrue(campo.abrir());
	}
	
	@Test
	void testarAbrirCampoNaoMinadoMarcado() {
		campo.alternarMarcacao();
		assertFalse(campo.abrir());
	}
	
	@Test
	void testarAbrirCampoMinadoMarcado() {
		campo.minar();
		campo.alternarMarcacao();
		assertFalse(campo.abrir());
	}
	
	@Test
	void testarAbrirCampoMinadoNaoMarcado() {
		campo.minar();
		assertThrows(ExplosaoException.class, () -> {
			campo.abrir();
		});
	}
	
	@Test
	void testarAbrirCamposVizinhancaSegura() {
		Campo vizinho1 = new Campo(2,2);
		Campo vizinhoDoVizinho1 = new Campo(1,1);
		vizinho1.adicionarVizinho(vizinhoDoVizinho1);
		
		campo.adicionarVizinho(vizinho1);
		vizinho1.adicionarVizinho(vizinhoDoVizinho1);
		
		campo.abrir();
		
		assertTrue(vizinho1.isAberto() && vizinhoDoVizinho1.isAberto());
	}
	
	@Test
	void testarAbrirCamposVizinhancaPerigosa() {
		Campo campo22 = new Campo(2,2);
		Campo campo11 = new Campo(1,1);
		Campo campo12 = new Campo(1,2);
		campo12.minar();
		
		campo22.adicionarVizinho(campo11);
		campo22.adicionarVizinho(campo12);
		
		campo.adicionarVizinho(campo22);
		campo.abrir();
		
		assertTrue(campo22.isAberto() && campo11.isFechado() && campo12.isFechado());
	}
	
	@Test
	void testarPosicaoCampoLinha() {
		assertEquals(3, campo.getLinha());
	}
	
	@Test
	void testarPosicaoCampoColuna() {
		assertEquals(3, campo.getColuna());
	}
	
	@Test
	void testarObjetivoCampoResolvido() {
		Campo campo22 = new Campo(2,2);
		campo22.minar();
		campo22.alternarMarcacao();
		
		campo.adicionarVizinho(campo22);
		campo.abrir();
		
		assertTrue(campo.objetivoAlcancado() &&
				   campo22.objetivoAlcancado());
	}
	
	@Test
	void testarMinasNaVizinhanca() {
		Campo campo22 = new Campo(2,2);
		Campo campo23 = new Campo(2,3);
		Campo campo24 = new Campo(2,4);
		Campo campo34 = new Campo(3,4);
		Campo campo44 = new Campo(4,4);
		Campo campo43 = new Campo(4,3);
		Campo campo42 = new Campo(4,2);
		Campo campo32 = new Campo(3,2);
		
		campo23.minar();
		campo34.minar();
		campo43.minar();
		campo32.minar();
		
		List<Campo> camposVizinhos = Arrays.asList(campo22,
				campo23, campo24, campo34, campo44, campo43,
				campo42, campo32);
		
		camposVizinhos.stream().forEach(c -> campo.adicionarVizinho(c));
		
		assertEquals(4, campo.minasNaVizinhanca());
	}
	
	@Test
	void testarReinicializacaoCampo() {
		campo.minar();
		campo.alternarMarcacao();
		
		
		Campo campo22 = new Campo(2,2);
		campo22.abrir();
		
		campo.reiniciar();
		campo22.reiniciar();
		assertTrue(campo.isSeguro() && campo.isDesmarcado() && 
				   campo22.isFechado());
		
	}
	
	@Test
	void testarValorCampoSemAlteracao() {
		assertEquals("?", campo.toString());
	}
	
	@Test
	void testarValorCampoAbertoVazio() {
		campo.abrir();
		assertEquals(" ", campo.toString());
	}
	
	@Test
	void testarValorCampoAbertoMinado() {
		campo.minar();
		try {
			campo.abrir();
		} catch(ExplosaoException e) {
			assertEquals("*", campo.toString());
		}
	}
	
	@Test
	void testarValorCampoMarcado() {
		campo.alternarMarcacao();
		assertEquals("x", campo.toString());
	}
	
	@Test
	void testarValorCampoMinasVizinhanca() {
		Campo campo22 = new Campo(2,2);
		Campo campo23 = new Campo(2,3);
		Campo campo24 = new Campo(2,4);
		Campo campo34 = new Campo(3,4);
		Campo campo44 = new Campo(4,4);
		Campo campo43 = new Campo(4,3);
		Campo campo42 = new Campo(4,2);
		Campo campo32 = new Campo(3,2);
		
		campo23.minar();
		campo34.minar();
		campo43.minar();
		campo32.minar();
		
		List<Campo> camposVizinhos = Arrays.asList(campo22,
				campo23, campo24, campo34, campo44, campo43,
				campo42, campo32);
		
		camposVizinhos.stream().forEach(c -> campo.adicionarVizinho(c));
		
		campo.abrir();
		
		assertEquals("4", campo.toString());
	}
	
	
}
