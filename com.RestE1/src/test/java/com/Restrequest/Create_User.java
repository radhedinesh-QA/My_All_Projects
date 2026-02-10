package com.Restrequest;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Create_User {
	@Test
	public void test()
	{
		RestAssured
		.given().body("{\r\n"
				+ "    \"name\": \"DHIRA\",\r\n"
				+ "    \"job\": \"SoftwareEngineer\"\r\n"
				+ "}")
		.contentType(ContentType.JSON)
		.header("x-api-key", "reqres-free-v1")
		.when().post("https://reqres.in/api/users")
		.then().statusCode(201).log().headers()
		.header("Content-Type", "application/json; charset=utf-8");
		

	}
}
