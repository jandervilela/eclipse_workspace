public class TesteNumerosImpares {

	public static void main(String[] args) {

		int soma = 0;
		int num = 0;
		int media = 0;
		String numerosImpares = "";

		while (num <= 1000) {
			if (num % 2 != 0) {

				soma = soma + num;
				media = media / num;
				System.out.println(num);

				numerosImpares += Integer.toString(num) + ", ";
			}

			num++;
		}
		System.out.println("soma dos n�meros �mpares de 1 a 1000 � : " + soma + ".");
		System.out.println("Quantidade de n�mero �mpar � : " + num / 2 + ".");
		System.out.println("M�dia dos n�meros �mpares � : " + soma / (num / 2) + ".");

		//String resultados = "soma dos n�meros �mpares de 1 a 1000 � : " + soma + ".\n"
				//+ "Quantidade de n�mero �mpar � : " + num / 2 + ".\n" + "M�dia dos n�meros �mpares � : "
				//+ soma / (num / 2) + ".\n" + "n�meros �mpares: " + numerosImpares;
		//JOptionPane.showMessageDialog (null, "\nresultados" + "\n" + resultados);
		//System.out.println("\n" + resultados + "\n");
	}

}
