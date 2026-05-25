package practiceStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class FilterName {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Dhruvil", "Patel", "Hiral", "Patel");

		names.stream().filter(name -> name.startsWith("P")).map(String::toUpperCase)
//			.forEach(System.out::println)
				.collect(Collectors.toList());
		
		System.out.println(names);

	}
}
