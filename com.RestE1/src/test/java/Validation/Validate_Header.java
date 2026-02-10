package Validation;

import java.io.File;

import org.apache.http.StatusLine;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Validate_Header {
	@Test

	public void loading()
	{
		File fil = new File("./src/test/resources/data.json");
		RestAssured
		.given().body(fil).contentType(ContentType.JSON)
		.when().post("https://petstore.swagger.io/v2/pet")
		.then().statusCode(200).log().all()
		.statusLine(Matchers.containsStringIgnoringCase("OK")).log().headers()
		.header("Content-Type", "application/json" )
		.header("Transfer-Encoding", "chunked");
	}
}
