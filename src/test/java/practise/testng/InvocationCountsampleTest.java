package practise.testng;

import org.testng.annotations.Test;

public class InvocationCountsampleTest {
	@Test(invocationCount = 1)
	public  void test1()
	{
		System.out.println("Test1 executed");
	}
	@Test(enabled=false)
	public  void CreateContact()
	{
		System.out.println("Contact created successfully");
	}


}
