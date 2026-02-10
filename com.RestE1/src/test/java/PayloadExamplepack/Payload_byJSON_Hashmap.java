package PayloadExamplepack;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Payload_byJSON_Hashmap {
	@Test
	public void loading()
	{
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("Name", "Mantesh");
		hm.put("Surname", "Durdungi Chigari");
		RestAssured
		.given().header("x-api-key", "reqres-free-v1")
		.body(hm)
		.header("content-type","application/json")
		.when().post("https://reqres.in/api/users")
		.then().statusCode(201).log().all();
	}
}
