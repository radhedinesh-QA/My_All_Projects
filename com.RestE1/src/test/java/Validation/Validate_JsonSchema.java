package Validation;

import org.testng.annotations.Test;
import static org.junit.Assert.assertThat;
import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import io.restassured.response.ValidatableResponse;

public class Validate_JsonSchema {
	@Test
	public void test()
	{
		//ValidatableResponse resp = (ValidatableResponse)given()
		given()
		.when().get("https://gorest.co.in/public/v2/users")
		.then().assertThat().statusCode(200).body(matchesJsonSchemaInClasspath("NewSchema.json"));
		//assertThat(resp.extract().body().asString(), matchesJsonSchemaInClasspath("NewSchema.json"));
	}
}
