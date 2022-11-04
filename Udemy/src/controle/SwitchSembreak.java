package controle;

public class SwitchSembreak {

	public static void main(String[] args) {

		String faixa = "preta";

		switch (faixa.toLowerCase()) {

		case "preta":
			System.out.println("Sei o Bassai-dai...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("Sei o Heian Godan");
		case "laranja":
			System.out.println("Sei o Heian yodan");
		case "vermelha":
			System.out.println("Sei o Heian Nidan");
		case "amarela":
			System.out.println("Sei o Heian Shodan");
			break;
		default:
			System.out.println("Não sei nada");

		}
		System.out.println("fim!");
		
		int idade = 2;
		
		switch (idade) {
		case 3:
			System.out.println("Sabe programar");
		case 2:
			System.out.println("Sabe falar");
		case 1:
			System.out.println("Sabe andar");
		case 0:
			System.out.println("Sabe respirar");
		}
		
	}

}
