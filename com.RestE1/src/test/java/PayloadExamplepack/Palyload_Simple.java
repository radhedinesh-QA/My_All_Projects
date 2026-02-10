package PayloadExamplepack;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Palyload_Simple {
	@Test
	public void SimpleLoad()
	{
		RestAssured
		.given().header("x-api-key", "reqres-free-v1")
		.body("{\r\n"
				+ "    \"name\": \"DHIRAj\",\r\n"
				+ "    \"job\": \"SoftwareEngineer-II\"\r\n"
				+ "}")
		.header("content-type", "application/json")
		.when().post("https://reqres.in/api/users")
		.then().statusCode(201).log().body();
	}
}
