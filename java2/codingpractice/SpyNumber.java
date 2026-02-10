package codingpractice;

public class SpyNumber {
	public static void main(String[] args) {
		int n = 22; int res =  n;
		int sum = 0; int prod = 1;
		
		while(n > 0)
		{
			int temp = n%10;
			sum+= temp;
			prod *= temp;
			n = n/10;
		}
		if(sum==prod)
		{
			System.out.println(res + " is Spy Number");
		}
		else
		{
			System.out.println("Not Spy Number");
		}
	}
}
