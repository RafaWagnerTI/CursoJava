package ti.wagner.rafa.calc.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

import ti.wagner.rafa.calc.modelo.Memoria;
import ti.wagner.rafa.calc.modelo.MemoriaObservador;

@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObservador, KeyListener {
	
	private final JLabel label;
	
	public Display() {
		Memoria.getInstancia().adicionarObservador(this);
		setFocusable(true);
		addKeyListener(this);
		setBackground(new Color(46, 49, 50));
		label = new JLabel(Memoria.getInstancia().getTextoAtual());
		label.setForeground(Color.WHITE);
		setDisplayFont(30);
		setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25));
		
		add(label);
	}

	@Override
	public void valorAlterado(String novoValor) {
		label.setText(novoValor);
	}
	
	public void redefinirFonte() {
		setDisplayFont(30);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
			String valor = String.valueOf(e.getKeyChar());
		if(Memoria.getInstancia().tamanhoTextoAtual() < 32 ||
				valor.equals("\b")) {
			Memoria.getInstancia().processarComando(valor);
		}
		
		if(Memoria.getInstancia().tamanhoTextoAtual() > 24)
			setDisplayFont(10);
		else if(Memoria.getInstancia().tamanhoTextoAtual() > 17)
			setDisplayFont(15);
		else if(Memoria.getInstancia().tamanhoTextoAtual() > 11)
			setDisplayFont(20);
		else redefinirFonte();
	}

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyReleased(KeyEvent e) {}
	
	public void setDisplayFont(int fontSize) {
		label.setFont(new Font("courier", Font.PLAIN, fontSize));
	}
	
}
