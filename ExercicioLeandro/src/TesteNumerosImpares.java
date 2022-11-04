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
		System.out.println("soma dos números ímpares de 1 a 1000 é : " + soma + ".");
		System.out.println("Quantidade de número ímpar é : " + num / 2 + ".");
		System.out.println("Média dos números ímpares é : " + soma / (num / 2) + ".");

		//String resultados = "soma dos números ímpares de 1 a 1000 é : " + soma + ".\n"
				//+ "Quantidade de número ímpar é : " + num / 2 + ".\n" + "Média dos números ímpares é : "
				//+ soma / (num / 2) + ".\n" + "números ímpares: " + numerosImpares;
		//JOptionPane.showMessageDialog (null, "\nresultados" + "\n" + resultados);
		//System.out.println("\n" + resultados + "\n");
	}

}
