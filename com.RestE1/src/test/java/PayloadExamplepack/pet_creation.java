package PayloadExamplepack;

import org.testng.annotations.Test;
import pet_POJO.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class pet_creation {
	@Test
	public void  Petcreate()
	{ Pet p = new Pet (55, "tiger");
		RestAssured
		
		.given().body(p).contentType(ContentType.JSON)
		.when().post("https://petstore.swagger.io/v2/pet")
		.then().statusCode(200).log().all();
	}
}
