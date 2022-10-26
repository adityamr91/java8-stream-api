package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExampleForMap {
	
	public static void main(String[] args) {
	
	List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9); 
	
	//square each numbers
	List<Integer> squares = numbers.stream().map( i -> i*i).collect(Collectors.toList());
	System.out.println(squares);
	
	//Convert integer to string
	List<String> makingString = numbers.stream().map( i -> "String Conversion : " + i+1).collect(Collectors.toList());
	System.out.println(makingString);
	
	List<Object> objectSample = Arrays.asList(1, "name", 2.0, 0.00, 4, "USA", 6, 7, 8, "Germany");
	
	//Convert Object to string
	List<String> objectString = objectSample.stream().map( i -> i.toString()).collect(Collectors.toList());
	System.out.println(objectString);
	
	}
}
