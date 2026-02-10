package PayloadExamplepack;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Payload_ByJSON {
	@Test
	public void testing()
	{
		JSONObject obj = new JSONObject();
		obj.put("Name", "Dinesh");
		obj.put("Surname", "Chigari");
		RestAssured
		.given().header("x-api-key", "reqres-free-v1")
		.body(obj.toJSONString())
		.header("content-type","application/json")
		.when().post("https://reqres.in/api/users")
		.then().statusCode(201).log().all();
	}
	
}
