package basicJavaProgram;

public class PrivateNonStatDriver {
public static void main(String[] args) {
	PrivateNonStatConsstructor p = new PrivateNonStatConsstructor("diensh", 5885);
	System.out.println(p.getName());
	System.out.println(p.getAge());
	System.out.println("=====");
	p.setAge(85999);
	p.setName("rammu");
	System.out.println(p.getName());
	System.out.println(p.getAge());
}
}
