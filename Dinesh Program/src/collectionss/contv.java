package collectionss;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class contv {
public static void main(String[] args) {
	 Integer[] intArray = {1, 6,2, 3, 4, 1, 2, 5};
	LinkedHashSet<Integer> hs =  new LinkedHashSet<>(Arrays.asList(intArray));
	System.out.println(hs);
	
	System.out.println("=================");
	 String[] array = {"apple", "banana", "orange", "apple"};

     LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList(array));
     linkedHashSet.remove(2);
     linkedHashSet.add("HAPPY");
     
     System.out.println(linkedHashSet); 
}
}
