package stream;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExemplo {
	public static void main(String[] args) {
		Supplier<String> saudacao = () -> "Olá, seja bem vindo(a)!";
		
		List<String> listaSaudacao = Stream.generate(() -> "Olá, seja bem vindo(a)!").limit(5).toList();
		
		listaSaudacao.forEach(System.out::println);
	}
}
