package Validation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Vali_Get {
	@Test

	public void run()
	{
		RestAssured
		.given().header("","")
		.when().get("https://reqres.in/api/users?page=2")
		.then().assertThat().statusCode(200).log().all();
		//.body(", null)
				
	}
}
