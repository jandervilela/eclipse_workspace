
public class BreakRotulado {
	
	public static void main(String[] args) {
		
		int y = 7;
		externo:
		for (int i = 0 ; i < 15; i++) {
			while (y > 3) {
				y++;
				System.out.println("Dentro do Loop");
				break externo;
			}
			System.out.println("Fora do Loop");
		}
		System.out.println("Fora do Programa");
	}

}
