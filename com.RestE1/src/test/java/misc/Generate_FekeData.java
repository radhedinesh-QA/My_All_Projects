package misc;

import com.github.javafaker.Faker;

public class Generate_FekeData {
public static void main(String[] args) {
	Faker fake = new Faker();
	
	String name = fake.name().fullName();
	System.out.println(name);
	
	String name1 = fake.name().firstName();
	System.out.println(name1);
	System.out.println(fake.internet().emailAddress());
	System.out.println(fake.job().position());
	System.out.println(fake.book().title());
	System.out.println(fake.phoneNumber().cellPhone());
	System.out.println(fake.animal().name());
}
}
