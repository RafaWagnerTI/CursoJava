package ti.wagner.rafa.cm.visao;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import ti.wagner.rafa.cm.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame {
	
	private static int dificuldadeJogo = 1;
	//
	private final static int ALTURA_PEQUENA = 345;
	private final static int LARGURA_PEQUENA = 219;
	private final static int ALTURA_MODERADA = 690;
	private final static int LARGURA_MODERADA = 438;
	private final static int ALTURA_GRANDE = 1035;
	private final static int LARGURA_GRANDE = 657;
	private static int ALTURA_PADRAO = ALTURA_MODERADA;
	private static int LARGURA_PADRAO = LARGURA_MODERADA;
	//
	private final static int LINHAS_PEQUENA = 8;
	private final static int COLUNAS_PEQUENA = 15;
	private final static int BOMBAS_PEQUENA = 25;
	private final static int LINHAS_MODERADA = 16;
	private final static int COLUNAS_MODERADA = 30;
	private final static int BOMBAS_MODERADA = 50;
	private final static int LINHAS_GRANDE = 24;
	private final static int COLUNAS_GRANDE = 45;
	private final static int BOMBAS_GRANDE = 75;
	private static int LINHAS_PADRAO = LINHAS_MODERADA;
	private static int COLUNAS_PADRAO = COLUNAS_MODERADA;
	private static int BOMBAS_PADRAO = BOMBAS_MODERADA;
	
	public TelaPrincipal() {
		add(new PainelTabuleiro(new Tabuleiro(getLinhaPadrao(), getColunaPadrao(), getBombaAtual())));
		setJMenuBar(criarMenus());
		setTitle("Campo Minado");
		setSize(getAlturaPadrao(), getLarguraPadrao());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TelaPrincipal();
	}
	
	private JMenuBar criarMenus() {
		JMenuBar menuBar = new JMenuBar();
		
		JMenu mnuDificuldade = new JMenu("Dificuldade");
		JMenu mnuTamanho = new JMenu("Tamanho");
		
		
		menuBar.add(mnuDificuldade);
		menuBar.add(mnuTamanho);
		
		JMenuItem mnuFacil = new JMenuItem("Fácil");
		JMenuItem mnuMedio = new JMenuItem("Médio");
		JMenuItem mnuDificil = new JMenuItem("Difícil");
		JMenuItem mnuPequeno = new JMenuItem("Pequeno");
		JMenuItem mnuModerado = new JMenuItem("Moderado");
		JMenuItem mnuGrande = new JMenuItem("Grande");
		
		mnuDificuldade.add(mnuFacil);
		mnuDificuldade.add(mnuMedio);
		mnuDificuldade.add(mnuDificil);
		
		mnuTamanho.add(mnuPequeno);
		mnuTamanho.add(mnuModerado);
		mnuTamanho.add(mnuGrande);
		
		mnuFacil.addActionListener(l -> {
			setDificuldadeJogo(0);
			dispose();
			new TelaPrincipal();
		});
		
		mnuMedio.addActionListener(l -> {
			setDificuldadeJogo(1);
			dispose();
			new TelaPrincipal();
		});
		
		mnuDificil.addActionListener(l -> {
			setDificuldadeJogo(2);
			dispose();
			new TelaPrincipal();
		});
		
		mnuPequeno.addActionListener(l -> {
			setLinhaPadrao(LINHAS_PEQUENA);
			setColunaPadrao(COLUNAS_PEQUENA);
			setBombaPadrao(BOMBAS_PEQUENA);
			setAlturaPadrao(ALTURA_PEQUENA);
			setLarguraPadrao(LARGURA_PEQUENA);
			dispose();
			new TelaPrincipal();
		});
		
		mnuModerado.addActionListener(l -> {
			setLinhaPadrao(LINHAS_MODERADA);
			setColunaPadrao(COLUNAS_MODERADA);
			setBombaPadrao(BOMBAS_MODERADA);
			setAlturaPadrao(ALTURA_MODERADA);
			setLarguraPadrao(LARGURA_MODERADA);
			dispose();
			new TelaPrincipal();
		});
		
		mnuGrande.addActionListener(l -> {
			setLinhaPadrao(LINHAS_GRANDE);
			setColunaPadrao(COLUNAS_GRANDE);
			setBombaPadrao(BOMBAS_GRANDE);
			setAlturaPadrao(ALTURA_GRANDE);
			setLarguraPadrao(LARGURA_GRANDE);
			dispose();
			new TelaPrincipal();
		});
		
		return menuBar;
	}

	private void setLinhaPadrao(int linha) {
		LINHAS_PADRAO = linha;
	}
	
	private void setColunaPadrao(int coluna) {
		COLUNAS_PADRAO = coluna;
	}
	
	private void setBombaPadrao(int bomba) {
		BOMBAS_PADRAO = bomba;
	}
	
	private void setAlturaPadrao(int altura) {
		ALTURA_PADRAO = altura;
	}
	
	private void setLarguraPadrao(int largura) {
		LARGURA_PADRAO = largura;
	}
	
	private void setDificuldadeJogo(int dificuldade) {
		dificuldadeJogo = dificuldade;
	}
	
	private int getLinhaPadrao() {
		return LINHAS_PADRAO;
	}
	
	private int getColunaPadrao() {
		return COLUNAS_PADRAO;
	}
	
	private int getBombaPadrao() {
		return BOMBAS_PADRAO;
	}
	
	private int getBombaAtual() {
		int bombaPadrao = getBombaPadrao();
		switch(getDificuldadeJogo()) {
		case 0: return (int) (bombaPadrao * 0.25);
		case 2: return (int) (bombaPadrao * 2.5);
		default: return bombaPadrao;
		}
	}
	
	private int getAlturaPadrao() {
		return ALTURA_PADRAO;
	}
	
	private int getLarguraPadrao() {
		return LARGURA_PADRAO;
	}
	
	private int getDificuldadeJogo() {
		return dificuldadeJogo;
	}
}
