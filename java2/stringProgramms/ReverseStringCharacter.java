package stringProgramms;

public class ReverseStringCharacter {
	public static void main (String[]args)
	{
		String s = "HiiamDineshChigari";
		char [] st = s.toCharArray();
		String res = "";
		for (int i =s.length()-1; i>=0;i--)
		{
			res+=st[i];
		}
		System.out.println(res);
	}
}
