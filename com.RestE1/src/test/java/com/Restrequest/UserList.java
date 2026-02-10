package com.Restrequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class UserList {
	@Test
	public void run()
	{
		RestAssured
		.given().header("x-api-key", "reqres-free-v1")
		.when().get("https://reqres.in/api/users?page=2")
		.then().statusCode(200).log().all();

	}
}
