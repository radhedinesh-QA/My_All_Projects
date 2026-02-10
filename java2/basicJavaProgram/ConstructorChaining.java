package basicJavaProgram;

public class ConstructorChaining {
    String name;
	String color;

	public ConstructorChaining() {
		System.out.println("no parameterized constructor execution");
	}

	public ConstructorChaining(String name )
	{
		this();
		this.name = name;
		
	}
	public ConstructorChaining(String name , String color)
	{
		this(name);
		this.name=name;
		this.color=color;
		
	}

}
