package stringProgramms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class RemoveduplicateCharacterFromString {
	public static void main(String[] args) {
		String s = "dineshDurdundiChigari";
		HashSet hs = new HashSet();
		for (char o: s.toCharArray())
		{
			hs.add(o);
		}
		for (Object p:hs )
		{
			System.out.print(p);
		}
	}
}

/**Write a program to remove duplicate character from given String
WAP to print unique character from given string. **/
