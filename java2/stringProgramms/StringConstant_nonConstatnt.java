package stringProgramms;

public class StringConstant_nonConstatnt {
public static void main(String[] args) {
	String s = "Dinesh";
	String r = new String ("Dinesh");
	
	System.out.println(s==r); //false
	System.out.println(s.equalsIgnoreCase(r)); // True
	System.out.println(s.hashCode()==r.hashCode());

	
}
}
