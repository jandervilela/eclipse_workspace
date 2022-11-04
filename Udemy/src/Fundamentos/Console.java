package Fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" Dia!\n\n");
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("MegaSena : %d %d %d %d %d %d %n", 
				1, 2, 3, 4, 5, 6);
		System.out.printf("salário: %.2f%n", 1234.987);
		System.out.printf("Nome: %s%n", "João");
		
		Scanner entrada = new Scanner(System.in);
		
		entrada.close();
		
	}

}
