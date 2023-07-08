package lambdas;

@FunctionalInterface
public interface Calculo {
	
	//Uma interface funcional só pode ter uma única função
	double executar(double a, double b);
	
	//Porém ainda é possível ter funções default, e estáticas sem impactar
	//a função única da interface
	default double executar2(double a, double b) {
		return a + b;
	}
	
	static double executar3(double a, double b) {
		return a + b;
	}
}
