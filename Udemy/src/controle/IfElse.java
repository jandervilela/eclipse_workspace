package controle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {

		String valor = JOptionPane.showInputDialog(
				"informe o Número:");
		int numero = Integer.parseInt(valor);

		if (numero % 2 == 0) {
			System.out.println("Número é par");
		} else {
			System.out.println("Número não é par");
		}
	}
}
