package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		final int AJUSTE = 32;
		final double FATOR = 5.0/9.0;
		double farenheit = 86;
		
		double celsius = (farenheit - AJUSTE) * FATOR;
		System.out.println(farenheit + "ºF são " + celsius + "ºC");
	}
}
