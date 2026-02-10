package basicJavaProgram;
import java.util.Scanner;

public class DynamicRead {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value");
	int user = sc.nextInt();
	System.out.println(user);
	System.out.println("Enter String");
	char ch =  sc.next().charAt(0);
	System.out.println(ch);
	System.out.println("Enter String");
	String st = sc.next();
	System.out.println(st);
	
}
}
