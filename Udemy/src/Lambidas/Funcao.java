package Lambidas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {

		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "?mpar";

		Function<Integer, String> oResultadoE = valor -> "O resultado ?: " + valor;

		Function<String, String> empolgado = valor -> valor + "!!!";

		// String resultadoFinal =
		// parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(32);

		System.out.println(parOuImpar.apply(32));
		// System.out.println(resultadoFinal);
	}

}
