import java.io.IOException;
import java.util.Scanner;

public class Switch {

	public static void main(String[] args) throws IOException {
		System.out.println("Digite um dos comandos abaixo do menu: ");
		System.out.println("1: COMPRAR; 2:VENDER; 3: LISTAR; 4: SAIR");
		//le do teclado um caracter
		
		Scanner scanner = new Scanner(System.in);
		int opcao = scanner.nextInt();
		switch (opcao) {
		case 1:
			System.out.println("Você acessou COMPRAR");
			break;
		case 2:
			System.out.println("Você acessou VENDER");
			break;
		case 3:
			System.out.println("Você acessou LISTAR");
			break;
			default:
				System.out.println("Saindo do sistema");
		}

	}
}
