package basicJavaProgram;

public class ConstStaticDirver {
	public static void main (String[]args)
	{
		System.out.println(ConstrStatic.name);
		ConstrStatic s = new ConstrStatic("Dinesh", 556);
		System.out.println(s.name);
		System.out.println(s.age);
	}
}
