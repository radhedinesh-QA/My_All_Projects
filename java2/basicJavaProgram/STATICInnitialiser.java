package basicJavaProgram;

public class STATICInnitialiser {
	// Single line initializer 
	static String name = "Dinesh";
	static int age = 25;
	
	// multi-line initializer 
	static 
	{
		System.out.println("i am dinesh");
	}
	public static void main(String[] args) {
		//as static block execute first multi-line will execute automatically
		
		// when we call single line initializer then it will execute
		
		System.out.println(name);
		System.out.println(age);
	}
}
