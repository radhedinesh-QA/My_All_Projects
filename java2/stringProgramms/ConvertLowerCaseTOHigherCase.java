package stringProgramms;

public class ConvertLowerCaseTOHigherCase {
	public static void main(String[] args) {
		String s = "dinesh";
		char [] ch = s.toCharArray();
		String res = "";
		
		for(int i = 0; i< ch.length; i++)
		{
			if( ch[i]>='a' && ch[i]<='z')
			{
				ch[i]= (char)(ch[i]-32);
				res+=ch[i];
			}
		}
		System.out.println(res);
	}
}
