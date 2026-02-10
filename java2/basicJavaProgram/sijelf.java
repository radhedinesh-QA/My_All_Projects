package basicJavaProgram;
import java.util.Scanner;
public class sijelf {
	public static void main(String[]args)
	{
		while(true)
		{
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter number");
			int c = sc.nextInt();
			switch(c) {
			case 5+1:
			{System.out.println("First");}
			break;
			case 4:
			{System.out.println("second");}
			default:
			{System.out.println("Not matching");}
			}
		}
	}
}

