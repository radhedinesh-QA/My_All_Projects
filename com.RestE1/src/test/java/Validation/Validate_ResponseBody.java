package Validation;

import static org.hamcrest.Matchers.* ;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Validate_ResponseBody {
	@Test
	public void sampleTest()
	{
		RestAssured
		.given().header("x-api-key", "reqres-free-v1")
		.when().get("https://reqres.in/api/users?page=2")
		.then().assertThat().statusCode(200).log().all()
		.time(Matchers.lessThan(3000L))
		.statusLine("HTTP/1.1 200 OK")
		.body("page", equalTo(2))
		.body("data[0].email", equalTo("michael.lawson@reqres.in"));
	}
}
