import java.util.Scanner;

public class MediaDeDoisNumeros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double x ,y, media;
		
		System.out.println("Digite o primeiro n�mero: ");
		x= sc.nextDouble();
		System.out.println("Digite o segundo n�mero: ");
		y = sc.nextDouble();
		media = (x + y) / 2.0;
		
		System.out.println("M�dia = " + media);
		sc.close();
	}
	
}