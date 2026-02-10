package Validation;

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;

public class Validate_Cookies {
	@Test
	public void testing()
	{
		RestAssured
		.given()
		.when().get("https://www.google.com/")
		.then().assertThat().statusCode(200).log().cookies()
		.cookie("AEC", notNullValue());
		//.cookie("AEC","AaJma5shx2opl4jJD0VZIViBjPfk2q6nO40xET6A6Uo48ET80yK6zV_F5A" );
	}
}
