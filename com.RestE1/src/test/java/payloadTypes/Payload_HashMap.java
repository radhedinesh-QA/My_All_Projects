package payloadTypes;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Payload_HashMap {
	@Test
	public void HashMap_payload()
	{
		 HashMap<String, Object> payload = new HashMap<>();
	        payload.put("name", "morpheus");
	        payload.put("job", "Enginner");
	        
		RestAssured
		.given().body(payload)
		.contentType(ContentType.JSON)
		.header("x-api-key", "reqres-free-v1")
		.when().post("https://reqres.in/api/users")
		.then().assertThat().statusCode(201).log().all();
	}
}
