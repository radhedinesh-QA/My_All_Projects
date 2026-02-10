package basicJavaProgram;

public class utdrive {
	public static void main(String []args)
	{
		ut u = new ut();
		System.out.println(u.name);
		System.out.println(u.model);
		System.out.println("++++++++++++");
		System.out.println(u instanceof ut1);
		System.out.println(u instanceof ut);
		ut1 s  = (ut1) u ;
		System.out.println(s.model);
		System.out.println(s.name);
		System.out.println(s.cost);
		System.out.println(s.speed);
		
	}
}
