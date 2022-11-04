package Fundamentos;

import javax.swing.JOptionPane;

public class Convers�oStringNumero {
	
	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog("Digite o Primeiro número:" );
		String valor2 = JOptionPane.showInputDialog("Digite o segundo número:" );
		
		System.out.println(valor1 + valor2);
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		System.out.println("Soma é " + soma);
		System.out.println("Média é " + soma / 2);
		
	
	}
	

}
