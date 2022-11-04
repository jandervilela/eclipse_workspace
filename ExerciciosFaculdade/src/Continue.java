
public class Continue {

	public static void main(String[] args) {
		
		for (int i = 0; i < 12; i++) {
			if ((i > 4) && (i < 8)) {
				continue;
			}
			//Apresenta na tela quando o i não estiver entre 4 e 8
			System.out.println("i =" + i);
		}
	}
}
