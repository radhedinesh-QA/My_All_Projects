package stringProgramms;

public class RemoveDuplicate {
	public static void main(String[] args) {
		String s = "Selenium automation";
		char ch [] = s.toCharArray();
		boolean b  [] = new boolean [ch.length];
		String res = "";
		for (int i = 0; i <ch.length;i++)
		{ 
			//if (ch[i] == ' ') continue;  // to exclude space
			if(b[i]==false)
			{
				int count = 0;
				for ( int j =0; j<ch.length;j++)
				{
					if(ch[i]==ch[j])
					{
						b[j]=true;
						count++;
					}
				}
				System.out.println(ch[i]+ " =="+ count);
				if(count ==1)
				{
					res += ch[i];
				}
			}
		}
		System.out.println(res + " ==>"+ res.length());
	}
}
