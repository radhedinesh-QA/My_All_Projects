package codingpractice;

public class NeonNumber {
	public static void main(String[] args) {
		//Neon Number
		for ( int j = 1; j<=100; j++)
		{
			int num  = j;
			int n  = num *num; int sum = 0; 

			while(n>0)
			{
				int temp = n%10;
				sum+= temp;
				n= n/10;
			}
			if(sum== num)
			{
				System.out.println(num + " is Neon Number");
			}
		}
	}
}
