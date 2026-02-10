package stringProgramms;

public class OccuranceInString {
	public static void main(String args[] )
	{
		String s= "dinesh dinesh";
		char[] ch =s.toCharArray();
		boolean [] blank = new boolean[ch.length];
		for (int i =0;i<ch.length;i++)
		{
			if(blank[i] == false)
			{
				int count = 0;
				for (int j =0;j<ch.length;j++)
				{
					if(ch[i]==ch[j])
					{
						count++;
						blank[j]=true;
					}
				}
				System.out.println(ch[i]+" ==> "+ count);
			}
			
		}
	}
}
