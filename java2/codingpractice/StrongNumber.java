package codingpractice;

public class StrongNumber {
	public static void main(String[] args) {
		int n = 40585; int sum = 0; int res = n;
		
		while(n > 0)
		{
			int temp =  n%10;
			int prod = 1;
			for(int i = 1;i <=temp; i++)
			{
				prod *= i;
			}
			sum += prod;
			n = n/10;
		}
		if(sum == res )
		{
			System.out.println(res + " is Strong Number");
		}
		else
		{System.out.println("Not Strong Number");}
	}

}
