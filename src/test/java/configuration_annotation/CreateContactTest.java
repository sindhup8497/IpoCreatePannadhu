package configuration_annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class CreateContactTest {
	
	@Test
	public void createContactWithDateTest()

	{
		System.out.println("Create contact with date executed");
	}
	@BeforeSuite
	public void configBS()
	{
		System.out.println("Before suite executed");
	}
	@BeforeMethod
	public void configBM()
	{
		System.out.println("Before Method executed");
	}
	@BeforeClass
	public void configBC()
	{
		System.out.println("Before class executed");
	}
	@AfterClass
	public void configAC()
	{
		System.out.println("After class executed");
	}
	
	@Test
	public void createContactTest()

	{
		System.out.println("Create contact executed");
	}
	@AfterMethod
	public void configAM()
	{
		System.out.println("After Method executed");
	}
	@AfterSuite
	public void configAS()
	{
		System.out.println("After suite executed");
	}

}
