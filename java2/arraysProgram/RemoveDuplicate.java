package arraysProgram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class RemoveDuplicate {
public static void main(String[] args) {
	Integer [] num = {10,20,0,50,20,10,60,5,66,25,52,52,60,66,80};
	// HashSet <Integer> hs = new HashSet(Arrays.asList(num));
	TreeSet <Integer> Ts = new TreeSet (Arrays.asList(num));
	for (Integer res :Ts)
	{
		System.out.println(res);
	}
}
}
