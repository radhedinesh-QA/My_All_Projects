package stringProgramms;

public class SumofStringNumbers {
	public static void main(String[] args) {
		String s = "di5ees6sf855dsef74";
		char [] ch = s.toCharArray();
		int sum = 0;
		for (int i =0; i<ch.length;i++)
		{
			if (ch[i]>='0'&& ch[i]<='9')
			{
				sum+=(ch[i]-48);
			}
		}
		System.out.println(sum);
	}
}
