package stringProgramms;

import java.util.ArrayList;

public class Getappearance_Of_Words {
	public static void main(String[] args) {
		String [] str = {"dinesh", "chigari", "java", "java", "dinesh"};
		boolean b [] = new boolean [str.length];
		ArrayList ar = new ArrayList();
		for (int i = 0; i< str.length; i++)
		{
			if(b[i]==false)
			{
				int count = 0;
				for(int j =0; j< str.length; j++)
				{
					if(str[i].equalsIgnoreCase(str[j]))
					{
						b[j]=true;
						count++;
					}

				}
				
				if(count>1)
				{
					System.out.println(str[i]+ " ==> " + count);
					ar.add(str[i]);
				}
			}
		}
		System.out.println("==========================");
		for(Object res :  ar)
		{
			System.out.println(res);
		}
	}

}
