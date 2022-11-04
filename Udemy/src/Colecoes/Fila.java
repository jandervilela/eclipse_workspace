package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();
		// offer e add --> adicionam elementos na fila
		//Diferenca é p comportamento quando a fila está cheia!
		fila.add("Ana");
		fila.offer("Bia");
		fila.add("Carlos");
		fila.offer("Rafaela");
		fila.add("Lucas");
		fila.offer("Marcia");
		
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.element());
		
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());

	}

}
