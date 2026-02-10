package codingpractice;

public class AmstrongNumber {
	public static void main(String[] args) {
		int n = 407 ; int count = 0; int m = n; int sum = 0;
		int x =m; 
		while(n> 0)
		{
			count++;
			n /=  10; 
		}
		while(m >0)
		{
			int temp = m %10;
			int prod = 1;
			for ( int i = 1; i<= count ; i++)
			{
				prod *= temp;
			}
			sum += prod;
			m /= 10;
		}
		if(sum == x )
		{
			System.out.println(x+ " is amstrong number");
		}
		else
		{
			System.out.println(" Not amstrong Number");
		}
	}
}
