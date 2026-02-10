package stringProgramms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Removeduplicateandmaintainorder {
	public static void main(String[] args) {
		String s = "dineshdurdundichigari";
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for (char c : s.toCharArray()) {
            set.add(c);
        }

        for (char c : set) {
            System.out.print(c);
        }
	}
}
