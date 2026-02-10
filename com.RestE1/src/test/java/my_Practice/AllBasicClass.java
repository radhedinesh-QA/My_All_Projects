package my_Practice;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import org.testng.annotations.Test;

public class AllBasicClass {

	@Test
	public static void GetMethod()
	{
		RestAssured
		//Passing the BasicAuth i.e. Username and Password
		.given()
		.when().get("https://api.restful-api.dev/objects")
		.then().log().body();
	}
	
	@Test
	public static void PostMethod()
	{
		RestAssured
		.given().body("{\r\n"
				+ "   \"name\": \"Apple MacBook Pro 16\",\r\n"
				+ "   \"data\": {\r\n"
				+ "      \"year\": 2019,\r\n"
				+ "      \"price\": 1849.99,\r\n"
				+ "      \"CPU model\": \"Intel Core i9\",\r\n"
				+ "      \"Hard disk size\": \"1 TB\"\r\n"
				+ "   }\r\n"
				+ "}")
		.contentType(ContentType.JSON)
		.when().post("https://api.restful-api.dev/objects")
		.then().log().body();
	}
	
	@Test
	public static void PutMethod()
	{
		RestAssured
		.given().body("{\r\n"
				+ "   \"name\": \"Apple MacBook Pro 16\",\r\n"
				+ "   \"data\": {\r\n"
				+ "      \"year\": 2019,\r\n"
				+ "      \"price\": 2049.99,\r\n"
				+ "      \"CPU model\": \"Intel Core i9\",\r\n"
				+ "      \"Hard disk size\": \"1 TB\",\r\n"
				+ "      \"color\": \"silver\"\r\n"
				+ "   }\r\n"
				+ "}")
		.contentType(ContentType.JSON)
		.when().put("https://api.restful-api.dev/objects/7")
		.then().log().all();
	}
	
	@Test
	public static void DeleteUesr()
	{
		RestAssured
		.when().delete("https://api.restful-api.dev/objects/6")
		.then().log().all();
	}
}


