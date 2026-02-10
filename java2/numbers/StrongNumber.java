package numbers;

public class StrongNumber {
	public static void main (String[]args)
	{
		int num = 145; int sum =0; int val = num;
		while (num>0)
		{
			int temp = num%10;
			int prod = 1;
			for (int i =1;i<=temp;i++)
			{
				prod*=i;
			}
			sum+=prod;
			num/=10;
		}
		if(sum== val)
		{
			System.out.println("Given numebr is strong number");
		}
		else
		{
			System.out.println("Given numebr is not strong number");
		}
	}
}
