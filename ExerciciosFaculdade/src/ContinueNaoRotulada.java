
public class ContinueNaoRotulada {
	
	public static void main(String[] args) {
		
		for (int cont = 1; cont <= 8; cont++) {
			if (cont == 3) {
				continue;
			}
			
			System.out.println("Nr: " + cont);
		}
	}

}
