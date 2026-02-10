package com.Restrequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class petCreation {
	@Test

	public void petCreate()
	{
		RestAssured

		.given().body("{\r\n"
				+ "  \"id\": 0,\r\n"
				+ "  \"category\": {\r\n"
				+ "    \"id\": 0,\r\n"
				+ "    \"name\": \"Eephant\"\r\n"
				+ "  },\r\n"
				+ "  \"name\": \"Rmmu\",\r\n"
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
		.contentType(ContentType.JSON).log().all()
		.when().post("https://petstore.swagger.io/v2/pet")
		.then().statusCode(200).log().all();
	}
	@Test
	public void Getpett()
	{
		RestAssured
		
		.given()
		.when().get("https://petstore.swagger.io/v2/pet/9223372036854028229")
		.then().statusCode(200).log().all();
	}
}
