package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		
		double a = 1.2345678888888; // Conversão Implícita
		System.out.println(a);
		
		float b = (float) 1.234567888888888; // Conversão explícita
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; // Conversão explícita 
		System.out.println(d);
		
		double e = 1.9999999;
		int f = (int) e;
		System.out.println(f);
		
	}
}
