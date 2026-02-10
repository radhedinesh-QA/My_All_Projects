package numbers;

public class NeonNumber {
	public static void main (String []args)
	{
		int a = 9;
		int n = a*a; int sum =0;
		while (n>0)
		{
			int temp = n%10;
			sum += temp;
			n=n/10;
		}
		
		if(a == sum)
		{
			System.out.println("Number is Neon number");
		}
		else
		{
			System.out.println("Number is not Neon number");
		}
		
		
	}
}
