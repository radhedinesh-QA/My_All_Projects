package com.Restrequest;

import org.testng.annotations.Test;

public class PriorityExample {
	@Test (priority = 0)

	public void adduser()
	{
		System.out.println("==Adding User==");
	}
	@Test (priority = 1)
	public void GetUser()
	{
		System.err.println("==Geting User==");
	}
	@Test
	public void UpdateUser()
	{
		System.out.println("==Updating User==");
	}
	
	@Test
	public void aaongUser()
	{
		System.out.println("==Wrong User");
	}
	
	@Test (priority = -1)
	public void DeleteUser()
	{
		System.out.println("==Deleting User");
	}
	
	@Test (priority = 0)

	public void doubleuser()
	{
		System.out.println("==Double User==");
	}
	
}
