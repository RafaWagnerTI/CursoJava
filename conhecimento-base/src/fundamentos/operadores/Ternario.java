package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		double media = 8.6;
		String resultadoParcial = media >= 5 ? "em recuperação" : "reprovado";
		String resultadoFinal = media >= 7 ? "aprovado" : resultadoParcial;
		
		System.out.printf("O aluno está %s.", resultadoFinal);
		
		double nota = 7.1;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultadoDesconto = temDesconto ? "Sim." : "Não.";
		
		System.out.printf("\nTem desconto? %s ", resultadoDesconto);
	} 
}
