package collectionss;

import java.util.HashMap;

public class mapping {
public static void main(String[] args) {
	HashMap hm = new HashMap<>();
	hm.put( "name", "dinesh");
	hm.put( 2 , 100);
	hm.put("greed", "hello");
	hm.put(4, 's');
	
	System.out.println(hm.get(2));
	System.out.println(hm.containsKey("greed"));
	hm.remove(2);
	System.out.println(hm);
	
	System.out.println("=======================");
	
}
}
