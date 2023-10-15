package ti.wagner.rafa.cm.visao;

import java.awt.GridLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import ti.wagner.rafa.cm.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class PainelTabuleiro extends JPanel {

	public PainelTabuleiro(Tabuleiro tabuleiro) {
		setLayout(new GridLayout(tabuleiro.getLinhas(), tabuleiro.getColunas()));
		
		tabuleiro.paraCadaCampo(c -> add(new BotaoCampo(c)));
		
		tabuleiro.registrarObservador(e -> {

			SwingUtilities.invokeLater(() -> {
				if(e) {
					tabuleiro.reproduzirSom("VitoriaJogo.wav");
					JOptionPane.showMessageDialog(this, "Você ganhou!!! :)");
				} else {
					JOptionPane.showMessageDialog(this, "Você perdeu!!! :(");
				}
				
				tabuleiro.reiniciar();
			});
			
		});
	}
	
}
