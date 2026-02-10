package my_Practice;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Sim {

	@Test
	public static void Run()
	{
		RestAssured
		.given().body("{\r\n"
				+ "    \"email\": \"sydney@fife\"\r\n"
				+ "}")
		.contentType("application/JSON")
		.header("Authorization", "x-api-key")
		.when().post("https://reqres.in/api/register")
		.then().log().body();
		
	}
}
