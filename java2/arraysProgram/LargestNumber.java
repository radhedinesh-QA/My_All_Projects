package arraysProgram;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;


public class LargestNumber {
	public static void main(String[] args) {
		Integer [] num = {42,10,52,35,02,22,63,5,8,58};
		TreeSet <Integer> Ts = new TreeSet(Arrays.asList(num));
		ArrayList <Integer> Ar = new ArrayList(Ts);
		System.out.println(Ar.get(Ar.size()-1));
		System.out.println(Ts.last());
		
		
		
	}
}
