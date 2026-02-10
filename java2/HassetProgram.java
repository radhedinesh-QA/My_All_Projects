import java.util.HashSet;

public class HassetProgram {
public static void main(String[] args) {
	String [] str = {"dinesh", "dinesh", "ram" , "sham", "ram", "hello", "bye", "ram", "se", "you"};
	
	HashSet<String> hs = new HashSet ();
	
	for (String s : str)
	{
		if (hs.add(s)==true)  ///
		{
			System.out.println(s);
		}
	}
}
}
