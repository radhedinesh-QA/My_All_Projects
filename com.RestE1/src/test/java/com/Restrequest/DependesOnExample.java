package com.Restrequest;

import org.testng.annotations.Test;

public class DependesOnExample {
	@Test 

	public void adduser()
	{
		System.out.println("==Adding User==");
	}
	@Test (dependsOnMethods = "adduser") 
	public void GetUser()
	{
		System.err.println("==Geting User==");
	}
	@Test (dependsOnMethods = "GetUser")
	public void UpdateUser()
	{
		System.out.println("==Updating User==");
	}
	@Test (dependsOnMethods = {"GetUser", "UpdateUser"},alwaysRun = true)
	public void DeleteUser()
	{
		System.out.println("==Deleting User");
	}
}
