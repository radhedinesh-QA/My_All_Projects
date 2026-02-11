package numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class strongNumberss {
	public static void main(String[] args) {
		String str = "Dinesh Dinesh Chigari p";
		char ch [] = str.toCharArray();
		HashSet<Character> hs = new HashSet<>();
		
		for ( char c : ch )
		{
			hs.add(c);
		}
		
		for(Object rs : hs)
		{
			System.out.println(rs);
		}
		
			
	}
}
