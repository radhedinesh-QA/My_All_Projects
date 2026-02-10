package my_Practice;

import java.io.File;
import java.util.HashMap;

import javax.annotation.meta.When;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import ra_POJO.Reqres_POJO;

public class PayLoads {

	@Test
	public static void StrinPayload()
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
		.when().post("https://api.restful-api.dev/objects")
		.then().log().body();
	}
	
	@Test
	public static void JSONPayload()
	{
		JSONObject ob =  new JSONObject();
		ob.put("Name","Dinesh");
		ob.put("Number", "9739861919");
		
		RestAssured
		.given().body(ob)
		.header("content-type","application/JSON")
		.when().post("https://reqres.in/api/users")
		.then().log().body();
	}
	
	@Test
	public static void JSON_HashMap()
	{
		HashMap<String, String> Hs = new HashMap ();
		Hs.put("Name", "Dinesh");
		Hs.put("JOb", "Engineer");
		
		RestAssured
		.given().body(Hs)
		.contentType("application/JSON")
		.when().post("https://reqres.in/api/users")
		.then().log().body();
	}
	
	@Test
	public static void FilePayload()
	{
		File p = new File("./src/test/resources/Payload_data.json");
		
		RestAssured
		.given().body(p)
		.contentType(ContentType.JSON)
		.when().post("https://reqres.in/api/users")
		.then().log().all();
	}
	
	@Test
	public static void POJO()
	{
		Reqres_POJO pojo = new Reqres_POJO("Manju", "TestEngineer");
		RestAssured
		.given().body(pojo)
		.contentType(ContentType.JSON)
		.header("x-api-key", "reqres-free-v1")
		.when().post("https://reqres.in/api/users")
		.then().log().body();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
