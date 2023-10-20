package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExemplo {
	public static void main(String[] args) {
		List<String> palavras = Arrays.asList("java", "kotlin", "c", "javascript", "go", "ruby", "python");
		
		Predicate<String> maisCincoCaracteres = palavra -> palavra.length() > 5;
		
		palavras.stream().filter(p -> p.length() > 5).forEach(System.out::println);
	}
}
