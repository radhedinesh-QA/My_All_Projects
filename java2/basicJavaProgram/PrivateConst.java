package basicJavaProgram;

public class PrivateConst {
	String name;
	int age;
	
	private PrivateConst(String name) 
	// private constructor can be called from other class even 
	//with object creation. 
	{this.name= name;
	}
	PrivateConst(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
}
