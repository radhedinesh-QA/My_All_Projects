package stringProgramms;

public class ReplaceSpaceWithCharacter {
	public static void main(String[] args) {
		String s = "Hi i am Dinesh Chigari";
		char ch [] =s.toCharArray();
		String  res ="";
		for(int i =0; i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
				res+=ch[i];
			}
		}
		System.out.println(res);
		
	}
}
