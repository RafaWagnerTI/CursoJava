package classe.exercicio;

public class Jantar {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("Cléber", 60.0);
		Comida c1 = new Comida("Arroz", 0.150);
		Comida c2 = new Comida("Feijão", 0.1);
		Comida c3 = new Comida("Carne", 0.4);
		
		System.out.println(p.informarPeso());
		
		p.comerComida(c1);
		p.comerComida(c2);
		p.comerComida(c3);
		
		System.out.println(p.informarPeso());
	}
	
}
