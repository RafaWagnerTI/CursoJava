package ti.wagner.rafa.calc.modelo;

import java.util.ArrayList;
import java.util.List;

public class Memoria {
	
	private static final Memoria instancia = new Memoria();
	
	private enum TipoComando {
		ZERAR, INV, PERC, APAG,
		NUM, DIV, MULT, SUB,
		SOMA, IGUAL, VIRGULA;
	};
	
	private final List<MemoriaObservador> observadores =
			new ArrayList<>();
	
	private TipoComando ultimaOperacao = null;
	private boolean substituir = false;
	private String textoAtual = "";
	private String textoArmazenado = "";
	
	private Memoria() {
		
	}
	
	public static Memoria getInstancia() {
		return instancia;
	}
	
	public void adicionarObservador(MemoriaObservador observador) {
		observadores.add(observador);
	}
	
	public String getTextoAtual() {
		return textoAtual.isEmpty() ? "0" : textoAtual;
	}
	
	public void processarComando(String texto) {
		
		TipoComando tc = detectarTipoComando(texto);
		
		if(tc == null) {
			return;
		} else if(tc == TipoComando.APAG) {
			textoAtual = textoAtual.substring(0, textoAtual.length() - 1);
		} else if(tc == TipoComando.ZERAR) {
			textoAtual = "";
			textoArmazenado = "";
			substituir = false;
			ultimaOperacao = null;
		} else if(tc == TipoComando.INV) {
			if(!textoAtual.isEmpty()) {
				if(textoAtual.contains("-")) {
					textoAtual = textoAtual.substring(1);
				} else {
					textoAtual = "-" + textoAtual;
				}
			}
		}
		else if(tc == TipoComando.NUM ||
		   tc == TipoComando.VIRGULA) {
			textoAtual = substituir ? texto : tc == TipoComando.VIRGULA ? getTextoAtual() + texto : textoAtual + texto;
			substituir = false;
		} else {
			substituir = true;
			textoAtual = obterResultadoOperacao(tc);
			textoArmazenado = getTextoAtual();
			ultimaOperacao = tc;
		}
		
		observadores.forEach(o -> o.valorAlterado(getTextoAtual()));
	}

	private String obterResultadoOperacao(TipoComando tc) {
		if(ultimaOperacao == null
		   || ultimaOperacao == TipoComando.IGUAL
		   || ultimaOperacao == TipoComando.PERC) {
			return textoAtual;
		}
		
		double numeroArmazenado = Double.parseDouble(textoArmazenado.isEmpty() ? "0" : 
			textoArmazenado.replace(",", "."));
		double numeroAtual = Double.parseDouble(textoAtual.isEmpty() ? "0" : textoAtual.replace(",", "."));
		
		if(tc == TipoComando.PERC) {
			 numeroAtual = (numeroArmazenado / 100) * numeroAtual;
		}
		
		double resultado = 0;
		
		if(ultimaOperacao == TipoComando.SOMA) {
			resultado = numeroArmazenado + numeroAtual;
		} else if(ultimaOperacao == TipoComando.SUB) {
			resultado = numeroArmazenado - numeroAtual;
		} else if(ultimaOperacao == TipoComando.MULT) {
			resultado = numeroArmazenado * numeroAtual;
		} else if(ultimaOperacao == TipoComando.DIV) {
			resultado = numeroArmazenado / numeroAtual;
		} 
		
		String resultadoString = Double.toString(resultado).replace(".", ",");
		boolean inteiro = resultadoString.endsWith(",0");
		return inteiro ? resultadoString.replace(",0" , "") : resultadoString;
	}

	private TipoComando detectarTipoComando(String texto) {
		
		if(textoAtual.isEmpty() && texto.equals("0")) 
			return null;
		
		try {
			Integer.parseInt(texto);
			return TipoComando.NUM;
		} catch (NumberFormatException e) {
			if("\b".equals(texto))
				return TipoComando.APAG;
			if("C".equals(texto))
				return TipoComando.ZERAR;
			if("±".equals(texto))
				return TipoComando.INV;
			if("%".equals(texto))
				return TipoComando.PERC;
			if("/".equals(texto))
				return TipoComando.DIV;
			if("*".equals(texto))
				return TipoComando.MULT;
			if("-".equals(texto))
				return TipoComando.SUB;
			if("+".equals(texto))
				return TipoComando.SOMA;
			if(",".equals(texto) && !textoAtual.contains(","))
				return TipoComando.VIRGULA;
			if("=".equals(texto))
				return TipoComando.IGUAL;
			
		}	
		
		return null;
	}
	
	public int tamanhoTextoAtual() {
		return textoAtual.length();
	}

}
