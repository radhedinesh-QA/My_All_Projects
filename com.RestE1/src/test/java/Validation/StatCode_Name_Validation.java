package Validation;

import java.sql.Time;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class StatCode_Name_Validation {
	@Test
	public void test()
	{
		RestAssured
		.given().body("{\r\n"
				+ "    \"name\": \"DHIRA\",\r\n"
				+ "    \"job\": \"SoftwareEngineer\"\r\n"
				+ "}")
		.contentType(ContentType.JSON)
		.header("x-api-key", "reqres-free-v1")
		.when().post("https://reqres.in/api/users")
		.then().assertThat().statusCode(201).log().all()
		//status line evaluation 1st method
		//.then().assertThat().statusLine("HTTP/1.1 201 Created").log().all();
		
		//status line evaluation 2nd method
		//.then().statusLine(Matchers.containsString("Created")).log().all();
		
		//status line evaluation 3rd method
		//.then().statusLine(Matchers.containsStringIgnoringCase("created")).log().all();
		.time(Matchers.lessThan(2000L));
	}
}
