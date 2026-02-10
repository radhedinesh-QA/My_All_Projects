package basicJavaProgram;

public class SonFatherDriver {
	public static void main(String[] args) {
		Inherfather f = new Inherfather();
		System.out.println(f.name);
		System.out.println(f.age);
		System.out.println(f instanceof  InherSon);
		Inherfather fs = new InherSon();
		System.out.println(fs instanceof  InherSon);
		InherSon s = (InherSon) fs;
		System.out.println(s.color);
		System.out.println(s.hight);
	}
}
