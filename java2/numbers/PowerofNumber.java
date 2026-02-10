package numbers;
import java.util.Scanner;

public class PowerofNumber {
	public 
	static void main (String []args)
	{
		Scanner sc  = new Scanner (System.in);
		System.out.println("Enter the numebr:");
		int num = sc.nextInt();
		System.out.println("Enter the Power of Number:");
		int pow = sc.nextInt();
		int product = 1;
		
		for (int i = 1; i<=pow;i++)
		{
			product*=num;
		}
		System.out.print(product);
	}
}
