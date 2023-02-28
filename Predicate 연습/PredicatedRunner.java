package javaNewApi;

import java.util.List;
import java.util.function.Predicate;

public class PredicatedRunner {
	
	static boolean isEvenWithMethod(Integer numbers) {
		return numbers % 2 == 0;
	}
	
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,4,5);
		
		Predicate<Integer> isEven = number -> number % 2 == 0;
		
		numbers.stream().filter(isEven).forEach(System.out::println);
		
		System.out.println("\n");
		
		numbers.stream().filter(Predicate.not(PredicatedRunner::isEvenWithMethod)).forEach(System.out::println);
	}
}
