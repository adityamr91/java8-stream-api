package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExampleForPeekLimitSkip {
	
	public static void main(String[] args) {
		List<Integer> withDuplicates = Arrays.asList(1, 3, 3, 5, 7, 8, 9, 9, 2, 4, 5, 6, 8, 10);
		
		//peek example
		List<Integer> peekEx = withDuplicates.stream().peek(System.out::println).collect(Collectors.toList());
		
		
		System.out.println("");
		List<Integer> limitEx = withDuplicates.stream().limit(10).collect(Collectors.toList());
		System.out.println("Print first 10 digits : "+limitEx);
		
		System.out.println("");
		List<Integer> limitEx1 = withDuplicates.stream().distinct().sorted().limit(8).collect(Collectors.toList());
		System.out.println("Distinct and Sorted : "+limitEx1);
		
		List<Integer> limitEx2 = withDuplicates.stream().distinct().sorted().skip(5).collect(Collectors.toList());
		System.out.println("Distinct and Sorted : "+limitEx2);
		
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        int max =  myList.stream().max(Integer::compare).get();
        System.out.println("Max value : " +max);  
        
        int min =  myList.stream().min(Integer::compare).get();
        System.out.println("min value : " +min);  
        
        long count =  myList.stream().count();
        System.out.println("Count : "+ count);   
	}

}
