package PayloadExamplepack;

import org.testng.annotations.Test;
import ra_POJO.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PayloadByreqPOJO {
	@Test
	public void test()
	{Reqres_POJO pojo = new Reqres_POJO("Manju", "TestEngineer");
		RestAssured
		.given().body(pojo).contentType(ContentType.JSON)
		.header("x-api-key", "reqres-free-v1")
		.when().post("https://reqres.in/api/users")
		.then().statusCode(201).log().all();
	}
}
