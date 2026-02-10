package numbers;

public class ReverseTheNumber {
	public static void main (String[]args)
	{
		int num = 4563; int rev = 0;
		while(num>0)
		{
			int temp = num%10;
			rev=rev*10+temp;
			num/=10;
		}
		System.out.println(rev);
	}
}
