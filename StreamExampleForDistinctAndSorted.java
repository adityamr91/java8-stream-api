package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExampleForDistinctAndSorted {

	public static void main(String[] args) {
		
		List<Integer> numbers1 = Arrays.asList(1, 3, 5, 7, 9, 2, 4, 6, 8, 10);
		
		//Ascending Order
		List<Integer> ascendingOrder = numbers1.stream().sorted().collect(Collectors.toList());
		System.out.println("Ascending Order : " + ascendingOrder);
		
		System.out.println("");
		
		//Descending Order
		List<Integer> descendingOrder = numbers1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Descending Order : " + descendingOrder);
		
		System.out.println("");
		//Distinct
		List<Integer> withDuplicates = Arrays.asList(1, 3, 3, 5, 7, 8, 9, 9, 2, 4, 5, 6, 8, 10);
		List<Integer> unique = withDuplicates.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println("Distinct & Sorted : " + unique);
		
		System.out.println("");
		
		//Custom sorting with Comparable method
		List<Integer> list = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8);
		Comparator<Integer> reverseComparator = new Comparator<Integer>() {
		  public int compare(Integer i1, Integer i2) {
		    return i2.compareTo(i1);
		  }
		}; 

		List<Integer> sortedList = list.stream().sorted(reverseComparator).collect(Collectors.toList());
		System.out.println("Custom sorting with Comparable : "+sortedList);
		
		System.out.println("");
		
		//Custom sorting with custom method where odd numbers first and even numbers at the end
				List<Integer> list1 = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8);
				Comparator<Integer> reverseComparator1 = new Comparator<Integer>() {
				  public int compare(Integer i1, Integer i2) {
					  int finalReturn = 0;
				    if (i1 % 2 ==0 & i2 %2 ==0) {
				    	finalReturn = 1;
				    } else if (i1 % 2 !=0 & i2 %2 ==0) {
				    	finalReturn = -1;
				    } else if (i1 % 2 ==0 & i2 %2 !=0) {
				    	finalReturn = 0;
				    }
				    	
				    	return finalReturn;
				  }			  
				};

	List<Integer> sortedList1 = list1.stream().sorted(reverseComparator1)
			.collect(Collectors.toList());
	System.out.println("Custom sort, Odd numbers first and even numbers last : " +sortedList1);
	
	
	Comparator<Integer> reverseComparator2 = new Comparator<Integer>() {
		  public int compare(Integer i1, Integer i2) {
			  int finalReturn = 0;
		    if (i1 % 2 == 0 & i2 %2 == 0) {
		    	finalReturn = 0;
		    } else if (i1 % 2 != 0 & i2 %2 == 0) {
		    	finalReturn = 1;
		    } else if (i1 % 2 == 0 & i2 %2 != 0) {
		    	finalReturn = -1;
		    } else if (i1 % 2 != 0 & i2 %2 != 0) {
		    	finalReturn = 0;
		    }
		    	
		    	return finalReturn;
		  }			  
		};

List<Integer> sortedList2 = list1.stream().sorted(reverseComparator2)
	.collect(Collectors.toList());
System.out.println("Custom sort, Even numbers first and odd numbers last : " +sortedList2);
}

}
