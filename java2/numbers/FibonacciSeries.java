package numbers;

public class FibonacciSeries {
	public static void main(String []args)
	{
		int a =0; int b =1;
		System.out.print(a +" ,");
		System.out.print(b+ " ,");
		for (int i= 1;i<8;i++)
		{
			int sum = a+b;
			System.out.print (sum +" , ");
			a=b;
			b=sum;
		}
		
	}
}
