package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExampleForFilter {

	public static void main(String[] args) {
		List<Integer> mainInput = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

//print all even numbers
		List<Integer> example1 = mainInput.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println("Even numbers : ");
		example1.forEach(System.out::println);

		System.out.println("");

//print all odd numbers
		List<Integer> example2 = mainInput.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
		System.out.println("Odd numbers : ");
		example2.forEach(System.out::println);
	
		System.out.println("");
	
//sum all numbers in list
		int example3 = mainInput.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Sum : "+ example3);
		
		System.out.println("");
		
// greater than or lesser than
		List<Integer> example4 = mainInput.stream().filter(i -> i >3 && i <6).collect(Collectors.toList());
		System.out.println("Greater than 4 and lesser than 6 : ");
		example4.forEach(System.out::println);
		
		System.out.println("");
		
// regex matc		
		List<String> mainInput2 = Arrays.asList("Bangalore, IND", "Sydney, AUS", "Las Vegas, USA", "London, UK", "New York, USA");
		
		List<String> example5 = mainInput2.stream().filter(i -> i.startsWith("L")).collect(Collectors.toList());
		System.out.println("Starts with L : ");
		example5.forEach(System.out::println);
		
		System.out.println("");
		
		List<String> example6 = mainInput2.stream().filter(i -> i.matches("(.*)USA(.*)")).collect(Collectors.toList());
		System.out.println("Match USA : ");
		example6.forEach(System.out::println);
		
		System.out.println("");
		
		
		
		
}
}
