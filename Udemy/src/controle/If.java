package controle;

import java.util.Scanner;

public class If {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a M�dia: ");
		double media = entrada.nextDouble();
		
		if (media <= 10 && media >= 7.0) {
			System.out.println("Aprovado!");
			System.out.println("Parab�ns!");
		}
		
		if(media < 7 && media >= 4.5) {
			System.out.println("Recupera��o");
		}
		boolean criterioReprovadoAtingido =
				media < 4.5 && media >=0;
				
		if (criterioReprovadoAtingido) {
			System.out.println("Reprovado");
			
		}
		
		entrada.close();
		
	}

}
