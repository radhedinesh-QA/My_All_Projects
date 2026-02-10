package basicJavaProgram;

public class Conn1 extends Connn {
	public static void main (String[]args)
	{
		System.out.println("Hello");
		Connn s = new Connn();
		Connn c = new Connn(10, "Dinesh");
		System.out.println(c.name);
		System.out.println(c.age);
	}
}
