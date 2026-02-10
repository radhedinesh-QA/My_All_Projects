package collectionss;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListArray {
 public static void main(String[] args) {
	ArrayList al = new ArrayList<>();
	al.add("Dinga");
	al.add(500);
	al.add('a');
	al.add(false);
	al.add("sheela");
	Iterator i = al.iterator();
	while(i.hasNext())
	{System.out.println(i.next());}
	System.out.println("*************************************");
	ListIterator o = al.listIterator();
	while (o.hasNext())
	{System.out.println(o.next());}
	System.out.println("===========================");
	while(o.hasPrevious())
	{System.out.println(o.previous());}
		
}
}
