package ti.wagner.rafa.cm;

import ti.wagner.rafa.cm.modelo.Tabuleiro;
import ti.wagner.rafa.cm.visao.TabuleiroConsole;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(5, 5, 5);
		
		new TabuleiroConsole(tabuleiro);
	}

}
