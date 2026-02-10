package arraysProgram;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayInlist {
	public static void main(String[] args) {
		Integer[] numbers = {10,20,30,40,50,60,80,60,50};

		// 2. Use Arrays.asList() to create a List
		List lis = Arrays.asList(numbers);

		// 3. Create a new ArrayList from the List
		ArrayList convertedArrayList = new ArrayList<>(lis);

		// Print the ArrayList to verify
		System.out.println("Converted ArrayList: " + convertedArrayList);
		
		HashSet hs = new HashSet<>(lis);
		System.out.println(hs);
		
	}
}
