package misc;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Reqres_Faker {
	@Test
	public void test()
	{
		Faker fakeData = new Faker();
		String fakename= fakeData.name().firstName();
		String fakejob = fakeData.job().title(); 
		
		JSONObject obj = new JSONObject();
		obj.put("name", fakename);
		obj.put("Job", fakejob) ;
		
		RestAssured
		.given().body(obj  ).contentType(ContentType.JSON)
		.header("x-api-key","reqres-free-v1")
		.when().post("https://reqres.in/api/users")
		.then().assertThat().statusCode(201).log().body();
		
	}
}
