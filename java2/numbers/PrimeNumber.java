package numbers;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String []args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Integer value: ");
		int n = sc.nextInt();
        int i =2;
        int count = 0;
       while (i<n/2)
       {
    	   if (n%i==0)
    	   {
    		   count++;
    		   break;
    	   }
    	   i++;
       }
       if (count ==0 && n !=1)
       {
    	   System.out.println(n+ " is prime numebr");
       }
       else
       {
    	   System.out.println(n+ " is not prime numebr");   
       }

	}
}
