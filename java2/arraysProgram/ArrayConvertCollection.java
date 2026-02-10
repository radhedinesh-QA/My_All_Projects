package arraysProgram;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class ArrayConvertCollection {
	public static void main(String[] args) {
		//array will convert into collection only when it is Integer type not int type
		Integer []num  =  {20,10,30,20,20,50,60,70,10,70};
		
		ArrayList as = new ArrayList<>(Arrays.asList(num));
		System.out.println(as);
		HashSet hs = new HashSet<>(Arrays.asList(num));
		System.out.println(hs);
		TreeSet ts = new TreeSet<>(Arrays.asList(num));
		System.out.println(ts);
		
		
	}
	
}
