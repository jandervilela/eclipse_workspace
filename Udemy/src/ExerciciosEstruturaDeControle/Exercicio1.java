package ExerciciosEstruturaDeControle;

import java.util.Scanner;

public class Exercicio1 {
	
		/**
		 * 1. Criar um programa que receba um número e verifique se ele está entre 0 e
		 * 10 e é par;
		 */

		public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);

			System.out.println("Digite um numero: ");
			int numero = scanner.nextInt();

			if (numero >= 0 && numero <= 10) {
				if (numero % 2 == 0) {
					System.out.println("O numero " + numero + " est� entre 0 e 10 e � um par.");
				} else {
					System.out.println("O numero " + numero + " est� entre 0 e 10 mas n�o � um par.");
				}
			} else {
				System.out.println("O numero " + numero + " n�o est� entre 0 e 10.");
			}
			scanner.close();
		}
	}

