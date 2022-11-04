
public class IfElse {
	
	public static void main(String[] args) {
		
		int valor1 = 10;
		int valor2 = 15;
		
		if (valor1 > 10 && valor2 > 10) {
			System.out.println("1) os dois valores sao maiores que 10");
		}else {
			System.out.println("1 o primeiro ou o segundo valor não é maior que 10");
		}
		if (valor1 > 10 || valor2 >10) {
			System.out.println("2) Um dos numeros é maior que 10");
		}else {
			System.out.println("2) Nenhum dos numeros é maior que 10");
		}
	}

}
