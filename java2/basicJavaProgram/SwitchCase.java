package basicJavaProgram;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		char ch = sc .next().charAt(0);
		switch(ch) 
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
		{
			System.out.println("Enter character is Owvel");
		}
		break;
		default:
		{
			System.out.println("Enter character is consonence");
		}
		}
	}
}
