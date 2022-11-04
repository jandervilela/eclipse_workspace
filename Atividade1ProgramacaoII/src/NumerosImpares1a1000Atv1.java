import javax.swing.JOptionPane;

/**Nome: Jander Viana Vilela
 * Ra: 21082308-5
 * AtividadeI Programação II 
 */

public class NumerosImpares1a1000Atv1 {

	public static void main(String[] args) {

		int soma = 0;

		int cont = 0;

		int num = 0;

		int media = 0;

		while (num <= 1000) {

			if (num == 1000) {

				
			}

			if (num % 2 != 0) {

				soma = soma + num;

				media = media / num;

				/* Aqui imprimi todos numeros Ímpares de 1 ate 1000 */
				System.out.println(num);

			}

			cont++;

			num++;

		}
		/* Resultado Console com Impressão Números Ímpares linha 40 a 42 */
		System.out.println(
				"soma dos números ímpares  de 1 a 1000 é : " + soma + " . " + "\nQuantidade de número ímpar é : "
						+ num / 2 + " . " + "\nMédia dos números ímpares é : " + soma / (num / 2) + " . ");

		/* Opcional imprimir com JOptionPane */
		JOptionPane.showMessageDialog(null,
				"soma dos números ímpares  de 1 a 1000 é : " + soma + " . " + "\nQuantidade de número ímpar é : "
						+ num / 2 + " . " + "\nMédia dos números ímpares é : " + soma / (num / 2) + " . ");

	}

}