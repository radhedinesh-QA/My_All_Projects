package Validation;

import static org.hamcrest.Matchers.*;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

public class Pet_validation {
	@Test
	public void Getpett()
	{
		RestAssured
		
		.given()
		.when().get("https://petstore.swagger.io/v2/pet/9223372036854775807")
		.then().assertThat().statusCode(200).log().body()
		.time(Matchers.lessThan(6000L))
		.time(Matchers.greaterThan(500L))
		.statusLine("HTTP/1.1 200 OK");
		//.body("x.id",equalTo("9223372036854776000"));
		
		
	}
}
