package misc;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DDT_PetStrore {
	@Test (dataProvider = "getpet")

	public void test()
	{
		given()
		.when().get("https://petstore.swagger.io/v2/pet/findByStatus")
		.then().assertThat().statusCode(200).log().body();
	}
	
	
}
