package numbers;

public class PallandromNumber {
	public static void main(String[] args) {
		int num = 1441; int rev = 0; int val =num;
		while(num>0)
		{
			int temp = num%10;
			rev=rev*10+temp;
			num/=10;
		}
		if (val==rev)
		{
			System.out.println("Number is  pallandrom")	;
		}
		else
		{
			System.out.println("Number is not pallandrom")	;
		}		
	}
}
