package basicJavaProgram;

public class Connstructore {
	String name;
	int age;
	double hight;

	Connstructore(String name, int age, double hight)
	{ 
	this.name=name;
	this.age= age;
	this.hight = hight;
	}
	public Connstructore() {
		System.out.println("Blank Constructure execution");
	}
	
}
