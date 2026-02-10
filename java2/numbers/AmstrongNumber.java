package numbers;

import java.util.Scanner;

public class AmstrongNumber {
	public static void main(String[] args) {
		while(true)
		{
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the number");
		int num  = sc.nextInt(); int count = 0; int num1 =num; int sum= 0; int num2 =num;
		while (num>0)
		{
			int temp = num%10;
			count++;
			num=num/10;
		}
		while(num1>0)
		{
			int temp = num1%10;
			int prod = 1;
			
			for (int i =1;i<=count;i++)
			{
				prod*=temp;
			}
			sum+=prod;
			num1/=10;
		}
		System.out.println(sum);
		if(num2==sum)
		{
			System.out.println("given number is amstrong number");
		}
		else
		{
			System.out.println("given number is not amstrong number");
		}
		}
	}
}
