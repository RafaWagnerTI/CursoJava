package excecao;

public class ChecadaVsNaoChecada {

	public static void main(String[] args) {
		
		// Uma exceção checada não passa desapercebida pelos métodos da pilha,
		//sendo obrigado trata-la, ou lança-la para o próximo.
		
		// Uma exceção não checada passa desapercebida, não sendo obrigado trata-la
		//em nenhum momento.
		
		try {
			gerarErro1(); // Por ser uma exceção Runtime, não é obrigado a tratar
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			gerarErro2(); // Por ser uma exceção checada, o programador é obrigado a tratar
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Fim :)");
	}
	
	// Exceção Não Checado ou Não Verificado
	static void gerarErro1() {
		throw new RuntimeException("Ocorreu um erro esperado! #01");
	}
	
	// Exceção checada ou verificada
	static void gerarErro2() throws Exception  {
		throw new Exception("Ocorreu um erro esperado! #02");
	}
	
}
