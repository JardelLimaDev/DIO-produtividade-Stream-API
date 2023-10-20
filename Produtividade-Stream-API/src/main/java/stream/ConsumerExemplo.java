package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExemplo {
	public static void main(String[] args) {
		List<Integer> numerosInteiros = Arrays.asList(1, 2, 3, 4, 5, 6, 8);
		
		Consumer<Integer> imprimirNumeroPar = numero -> {
			if (numero % 2 == 0 ) {
				System.out.println(numero);
			}
		};
		
		numerosInteiros.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
	}
}