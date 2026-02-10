package codingpractice;

public class PrimeNUmber {
	public static void main (String[]args)
	{
		for (int j = 1;j<=50; j++ )
		{
		int num = j; int count = 0;
		for (int i = 1; i<num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==1 && j != 1 )
		{
			System.out.println(j+" Number is prime");
		}
		}
	}
}
