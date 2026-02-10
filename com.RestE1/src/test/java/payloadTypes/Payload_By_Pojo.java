package payloadTypes;
import my_Pojo.Pojo_UserData;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Payload_By_Pojo {
	@Test
	
	public void Payload_Pojo()
	{
		Pojo_UserData data = new Pojo_UserData("dinesh", "Doctor");
		RestAssured
		.given().body(data)
		.contentType(ContentType.JSON)
		.header("x-api-key", "reqres-free-v1")
		.when().post("https://reqres.in/api/users")
		.then().assertThat().statusCode(201).log().body();
	}
}
