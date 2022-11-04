package Streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

	public static void main(String[] args) {

		List<String> aprovados = Arrays.asList("Lu", "Gui", "Lucas", "Ana");

		System.out.println("Usando o foreach...");
		for (String nome : aprovados) {
			System.out.println(nome);

		}
		System.out.println("\nUsando iterator...");
		Iterator<String> iterator = aprovados.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("\nUsando Stream...");
		Stream<String> stream = aprovados.stream();		
		stream.forEach(System.out::println);// la�o Interno!!!
	}

}
