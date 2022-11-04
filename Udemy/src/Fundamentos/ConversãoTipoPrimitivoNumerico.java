package Fundamentos;

public class ConversãoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1; //implicita
		System.out.println(a);
		
		float b = (float) 1.123456888888; // explicita (Cast)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c;   //explicita (Cast)
		System.out.println(d);
		
		double e = 1.9999999;
		int f = (int) e;    // expicita (Cast)
		System.out.println(f);
				
	}
}
