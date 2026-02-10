package stringProgramms;

public class ReverseWordandCharacters {
public static void main(String[] args) {
	String s = "i am dinesh";
	String [] str = s.split(" ");
	String res="";
	for (int i =str.length-1;i>=0;i--)
	{
		char [] ch = str[i].toCharArray();
		String sub ="";
		for(int j =ch.length-1;j>=0;j--)
		{
			sub+=ch[j];
		}
		res=res+sub+" ";
	}
	System.out.println(res);
}
}

/**NO, the standard Java String class does NOT HAVE a built-in reverse() method.
 *  This is primarily because String objects are immutable in Java, meaning their 
 *  internal value cannot be changed after they are created.
 *  However, the mutable classes StringBuilder and StringBuffer both provide an
 *  efficient, built-in reverse() method. **/
