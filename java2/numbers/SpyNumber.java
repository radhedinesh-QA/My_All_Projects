package numbers;

import java.util.Scanner;

public class SpyNumber {
public static void main (String []args)
{
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the numbered value: ");
	int num = sc.nextInt(); int sum=0; int prod = 1;
	while (num>0)
	{
		int temp= num%10;
		sum+=temp;
		prod*=temp;
		num/=10;
	}
	if (sum==prod)
	{
		System.out.println("Given number is spy number");
		
	}
	else
	{
		System.out.println("Given number is not spy number");
		
	}
	
}
}
