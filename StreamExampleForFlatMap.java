package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExampleForFlatMap {
	
	List<Integer> numbers1 = Arrays.asList(1,3,5,7,9);
	List<Integer> numbers2 = Arrays.asList(2,4,6,8,10);
	
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1,2,3);
		List<Integer> list2 = Arrays.asList(4,5,6);
		List<Integer> list3 = Arrays.asList(7,8,9);
		
		// Concat all lists
		List<List<Integer>> listOfLists = Arrays.asList(list1, list2, list3);
		 
		List<Integer> listOfAllIntegers = listOfLists.stream()
		          .flatMap(x -> x.stream())
		          .collect(Collectors.toList());

		System.out.println(listOfAllIntegers);
		System.out.println("");
		
		// Concat all lists without flatmap
		List<Integer> numbers1 = Arrays.asList(1,3,5,7,9);
		List<Integer> numbers2 = Arrays.asList(2,4,6,8,10);
		List<Integer> concatedNumbers = Stream.concat(numbers1.stream(), numbers2.stream()).collect(Collectors.toList());
		List<Integer> concatedNumbersSorted = Stream.concat(numbers1.stream(), numbers2.stream()).sorted().collect(Collectors.toList());
		System.out.println(concatedNumbers);
		System.out.println(concatedNumbersSorted);
		
	}

}
