package Fundamentos;

public class tipoString { 
	public static void main(String[] args) {
		System.out.println("Olá Lucas Lindo".charAt(4));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!!!!"));
		System.out.println(s + "!!!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("boa Tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Lucas";
		var sobrenome = "Martins";
		var idade = 33;
		var salario = 12345.987;
		
		String maisUmaFrase = "Nome: " + nome + "\nSobrenome: "
				+sobrenome + "\n Idade: " + idade + 
				"\nSalario: " + salario + "\n\n";
		System.out.println(maisUmaFrase);
		String frase = String.format("O senhor %s %s tem %s anos e ganha R$%.2f." ,
				nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6 , 10));
		
		
		
		
		
		
		
	}

}
