package practice.testing;

import org.testng.annotations.Test;

public class ContactTest 
{
	@Test
	public void createContactTest()
	{
		System.out.println("execute login");
		System.out.println("execute navigate to contact");
		System.out.println("execute create contact");
		System.out.println("execute verify contact");
		System.out.println("execute logout");
	}
	
	@Test
	public void createContactWithMobileNumberTest()
	{
		System.out.println("execute createContactWithMobileNumberTest");
	}
	
}
