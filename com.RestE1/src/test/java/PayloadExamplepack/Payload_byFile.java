package PayloadExamplepack;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Payload_byFile {
	@Test

	public void loading()
	{
		File fil = new File("./src/test/resources/data.json");
		RestAssured
		.given().body(fil).contentType(ContentType.JSON)
		.when().post("https://petstore.swagger.io/v2/pet")
		.then().statusCode(200).log().all();
	}
}
