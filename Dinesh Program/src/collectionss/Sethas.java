package collectionss;

import java.util.EventObject;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Sethas {
	public static void main(String[] args) {
		 LinkedHashSet hs = new LinkedHashSet<>() ;
		hs.add("sheela");
		hs.add(500);
		hs.add("meet");
		hs.add('a');
		hs.add(false);
		hs.add(500);
		hs.add("sheela");
		
		for (Object o :hs)
		{System.out.println(o);}
	}
}
