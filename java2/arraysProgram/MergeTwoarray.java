package arraysProgram;

public class MergeTwoarray {
	public static void main(String[]args)
	{
		int a [] = {10,20,30,40,50};
		int b [] = {60,70,80,90,100};
		
		int [] c  = new int [a.length+b.length];
		
		for (int i = 0; i<a.length; i++)
		{
			c[i]=a[i];
		}
		for (int j = 0; j<b.length; j++)
		{
			c[a.length+j] = b[j];
		}
			
			
		for (int s : c)
		{
			System.out.println(s);
		}
	}
}
