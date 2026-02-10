package basicJavaProgram;
import java.util.Scanner;

public class iflisfe {
public static void main (String[]args)
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter charater");
char c = sc.next().charAt(0);
if(c>'a'&& c<'z' || c>'A' && c<'Z' )
{
	System.out.println("Given character is alphabate");
	}
else if (c>'0' && c< '9')
{
	System.out.println("Given character is number");
	}
else
{
	System.out.println("Given character is special characer");}
}
}
