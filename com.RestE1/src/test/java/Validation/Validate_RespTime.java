package Validation;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Validate_RespTime {
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
		.then().assertThat().statusCode(201).log().all()
		//.time(Matchers.lessThan(3000L))
		//.time(Matchers.greaterThan(300L));
		.time(Matchers.both(Matchers.lessThan(2500L)).and(Matchers.greaterThan(300L)));
	}
}
