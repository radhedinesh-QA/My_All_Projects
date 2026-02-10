package payloadTypes;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Payload_By_JSONFile {
	@Test
	public void Payload_By_file()
	{
		File fil = new File ("./src/test/resources/Payload_data.json");
		RestAssured
		.given().body(fil)
		.contentType(ContentType.JSON)
		.header("x-api-key", "reqres-free-v1")
		.when().post("https://reqres.in/api/users")
		.then().assertThat().statusCode(201).log().all();
	}
}
