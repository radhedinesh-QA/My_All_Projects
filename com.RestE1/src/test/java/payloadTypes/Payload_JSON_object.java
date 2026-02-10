package payloadTypes;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Payload_JSON_object {
	@Test
	public void Payload_JSONOBJECT()
	{
		JSONObject obj = new JSONObject();
		obj.put("name", "Raghu");
		obj.put("job", "manager");
		
		RestAssured
		.given().body(obj)
		.contentType(ContentType.JSON)
		.header("x-api-key", "reqres-free-v1")
		.when().post("https://reqres.in/api/users")
		.then().assertThat().statusCode(201).log().body();
	}
}
