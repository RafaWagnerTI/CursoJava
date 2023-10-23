package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {

	public static void main(String[] args) {
		
		
		JFrame  janela = new JFrame("Observador");
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		janela.setSize(600, 200);
		janela.setLayout(new FlowLayout()); // Um estilo de layout que muda o
											//posicionamento do botão.
		janela.setLocationRelativeTo(null); // Centraliza a tela no centro do monitor.
		
		JButton botao = new JButton("Clica!");
		janela.add(botao);
		
		botao.addActionListener(e -> {
			System.out.println("Evento ocorreu!");
		});
		
		janela.setVisible(true);
		
		
		
		
	}
	
}
