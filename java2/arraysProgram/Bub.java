package arraysProgram;

public class Bub {
	public static void main (String args[])
	{
		int a[] = {30,60,10,20,80,40};
		for (int i =0;i<=a.length-1;i++)
		{
			for (int j =0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp =a[j];
					a[j]= a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for (int o:a)
		{
			System.out.println(o);
		}
	}
}
