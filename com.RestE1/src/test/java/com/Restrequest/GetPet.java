package com.Restrequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetPet {
	@Test
	public void Getpett()
	{	
		RestAssured
		.given()
		.when().get("https://petstore.swagger.io/v2/pet/9223372036854028229")
		.then().statusCode(200).log().body();
	}
}
