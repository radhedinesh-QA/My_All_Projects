package basicJavaProgram;

public class NOnstaticvariable {
	String name;
	static int age ;
	String sex = "male";
	static
	{
		System.out.println("I am first stat");
	}
	
	public static void main(String[] args) {
		String color = "blue";
		{
			System.out.println("Hellow");
		}
		
		System.out.println(color);
		System.out.println(age);
		 NOnstaticvariable n = new NOnstaticvariable();
		 System.out.println(n.name);
		 System.out.println(n.age);
		 System.out.println(n.sex);
	}
	
}
