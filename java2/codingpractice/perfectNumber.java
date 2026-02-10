package codingpractice;

public class perfectNumber {
	public static void main(String[] args) {
		int num = 25; int sum = 0;
		for ( int i = 1; i<num; i++)
		{
			if(num%i==0)
			{
				sum+=i ;
			}
		}
		if(sum == num )
		{
			System.out.println(num + " is perfect Number");
		}
		else
		{System.out.println("not perfect Number");}
	}
}
