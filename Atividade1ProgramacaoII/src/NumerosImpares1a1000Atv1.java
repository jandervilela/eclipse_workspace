import javax.swing.JOptionPane;

/**Nome: Jander Viana Vilela
 * Ra: 21082308-5
 * AtividadeI Programa��o II 
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

				/* Aqui imprimi todos numeros �mpares de 1 ate 1000 */
				System.out.println(num);

			}

			cont++;

			num++;

		}
		/* Resultado Console com Impress�o N�meros �mpares linha 40 a 42 */
		System.out.println(
				"soma dos n�meros �mpares  de 1 a 1000 � : " + soma + " . " + "\nQuantidade de n�mero �mpar � : "
						+ num / 2 + " . " + "\nM�dia dos n�meros �mpares � : " + soma / (num / 2) + " . ");

		/* Opcional imprimir com JOptionPane */
		JOptionPane.showMessageDialog(null,
				"soma dos n�meros �mpares  de 1 a 1000 � : " + soma + " . " + "\nQuantidade de n�mero �mpar � : "
						+ num / 2 + " . " + "\nM�dia dos n�meros �mpares � : " + soma / (num / 2) + " . ");

	}

}