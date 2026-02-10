package basicJavaProgram;

public class STATICVariable {
	static String name ;
	static int age;
	
	public static void main(String[] args) {
		System.out.println(name);
		System.out.println(STATICVariable.age);
		age = 25;
		System.out.println(STATICVariable.age);
		name ="dinesh";
		System.out.println(name);
	}
}
