	
	import java.util.Scanner;
  
	public class Calculadora {
	
	public static void main(String args[]) {
    short operacao;

    double num1, num2, num3, raiz;

    Scanner input = new Scanner(System.in);


    do {
      System.out.println("Digite a operacao desejada:");
      System.out.println("  1. Soma");
      System.out.println("  2. Subtracao");
      System.out.println("  3. Multiplicacao");
      System.out.println("  4. Divisao");
      System.out.println("  5. Raíz Quadrada");
      System.out.println("  6. Elevar o numero ao quadrado");
      System.out.println("  0. Sair");
      System.out.print("Operacao: ");
      operacao = input.nextShort();
      if (!OperacaoExiste(operacao)) {
        continue;
      }
      if (operacao == 0) {
        System.out.println("Programa Encerrado!");
        break;
      }
      if (operacao == 5) {
        System.out.print("Digite um número para ver sua raiz quadrada : ");
        num1 = input.nextDouble();
        System.out.println(
          "RESULTADO: A raiz quadrada de "+ num1+ ": "+ (raiz = Math.sqrt(num1))  +
          "\n"
        );
        continue;    
      }
      if (operacao == 6) {
        System.out.print("Digite um número para elevar ao quadrado: ");
        num1 = input.nextDouble();
        System.out.println(
          "RESULTADO: "+num1+" Elevado ao quadrado : "+ (raiz = Math.pow(num1, 2.0))  +
          "\n"
        );
        continue; 
      }
      System.out.print("Digite o primeiro valor: ");
      num1 = input.nextDouble();
      System.out.print("Digite o segundo valor: ");
      num2 = input.nextDouble();
      if (!ValidaDadosDeEntrada(operacao, num1, num2)) {
        continue;
      }
      System.out.println(
        "RESULTADO: O resultado da operacao " +
        getNomeOperacao(operacao) +
        " é " +
        Calcular(operacao, num1, num2) +
        "\n"
      );
    } while (operacao != 0);
  
    input.close();
  }
  static double Calcular(short operacao, double num1, double num2) {
    double resultado = 0;
    switch (operacao) {
      case 1: //soma
        resultado = num1 + num2;
        break;
      case 2: //substração
        resultado = num1 - num2;
        break;
      case 3: //multiplicação
        resultado = num1 * num2;
        break;
      case 4: //divisão
        resultado = num1 / num2;
        break;
    }

    return resultado;
  }

  static boolean OperacaoExiste(short operacao) {
    boolean retorno = true;

    if (operacao > 6) {
      System.out.println("ERRO: Operacao escolhida é invalida.\n");
      retorno = false;
    }

    return retorno;
  }

  static boolean ValidaDadosDeEntrada(
    short operacao,
    double num1,
    double num2
  ) {
    boolean retorno = true;

    if (operacao == 4 & num2 == 0) {
      System.out.println("ERRO: Divisor nao pode ser zero.\n");

      retorno = false;
    }

    return retorno;
  }

  static String getNomeOperacao(short operacao) {
    switch (operacao) {
      case 1:
        return "soma";
      case 2:
        return "subtracao";
      case 3:
        return "multiplicacao";
      case 4:
        return "divisao";
      case 5:
        return ":";
      case 6:
        return ":";
      default:
        return "undefined";
    }
    
  }
  
}