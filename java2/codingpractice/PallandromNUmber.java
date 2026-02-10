package codingpractice;

public class PallandromNUmber {
public static void main(String[] args) {
	int n = 1551 ; int rev = 0; int m = n;
	while(n>0)
	{
		int temp = n%10;
		rev = rev*10+temp; 
		n = n/10;
	}
	if( rev == m )
	{
		System.out.println("Pallandrom Number");
	}
	else {
		System.out.println("Not");
	}
}
}
