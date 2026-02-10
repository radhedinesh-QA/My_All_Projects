package com.Restrequest;

import javax.annotation.meta.When;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class AllRequest {
	@Test
	public static void GetuObject()
	{
		RestAssured
		.given().header("x-api-key", "reqres_19b54bf4d3e94a38b52e0c26df308546")
		.when().get("https://reqres.in/api/users?page=2")
		.then().statusCode(200).log().all();
	}
	
	@Test
	public static void GetObjectList()
	{
		RestAssured
		.given()
		.when().get("")
		.then().statusCode(200).log().body();
		
	}
	
	@Test
	public static void CreatObject()
	{
		RestAssured
		.given().body("{\r\n"
				+ "  \"id\": 0,\r\n"
				+ "  \"category\": {\r\n"
				+ "    \"id\": 0,\r\n"
				+ "    \"name\": \"ROckky\"\r\n"
				+ "  },\r\n"
				+ "  \"name\": \"ROky Bhai\",\r\n"
				+ "  \"photoUrls\": [\r\n"
				+ "    \"string\"\r\n"
				+ "  ],\r\n"
				+ "  \"tags\": [\r\n"
				+ "    {\r\n"
				+ "      \"id\": 0,\r\n"
				+ "      \"name\": \"string\"\r\n"
				+ "    }\r\n"
				+ "  ],\r\n"
				+ "  \"status\": \"available\"\r\n"
				+ "}")
		
		.contentType(ContentType.JSON)
		.when().get("petstore.swagger.io/v2/pet")
		.then().statusCode(204).log().all();
	}
}
