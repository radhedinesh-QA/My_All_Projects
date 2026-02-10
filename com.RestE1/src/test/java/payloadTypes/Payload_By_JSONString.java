package payloadTypes;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Payload_By_JSONString {
	@Test
	public void StringJsonLoad()
	{
		String payload = "{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}";
		RestAssured
		/*.given().body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}")
		.contentType(ContentType.JSON)
		.header("x-api-key", "reqres-free-v1")
		.when().post("https://reqres.in/api/users")
		.then().assertThat().statusCode(201).log().body();*/
		.given().body(payload)
		.header("Content-Type", "application/json")
		.header("x-api-key", "reqres-free-v1")
		.when().post("https://reqres.in/api/users")
		.then().assertThat().statusCode(201).log().body();
				
	}
}
