import javax.swing.JOptionPane;

public class TesteNumerosImpares {

	public static void main(String[] args) {

		int soma = 0;

		int cont = 0;

		int num = 0;

		int media = 0;
		
		while (num <= 1000) {

			if (num == 1000) {

				break;

			}

			if (num % 2 != 0) {

				soma = soma + num;

				media = soma / (num);
				
				/*como fazer JOptionPane imprimir todos numeros impares?
				 * igual exemplo println!
				 * 
				 * */
				
				System.out.println(num);
				//System.out.println(media + num);
				

			}

			cont++;

			num++;

		}
					
		JOptionPane.showMessageDialog(null, "soma dos n�meros �mpares  de 1 a 1000 � : " + soma + ".");
		JOptionPane.showMessageDialog(null, "Quantidade de n�mero �mpar � : " + num / 2 + ".");
		JOptionPane.showMessageDialog(null, "M�dia dos n�meros �mpares � : " + soma / (num / 2) + ".");
		
		// System.out.println("soma dos n�meros �mpares de 1 a 1000 � : " + soma + ".");
		// System.out.println("Quantidade de n�mero �mpar � : " + num / 2 + ".");
		// System.out.println("M�dia dos n�meros �mpares � : " + soma / (num / 2) +
		// ".");

	}

}
