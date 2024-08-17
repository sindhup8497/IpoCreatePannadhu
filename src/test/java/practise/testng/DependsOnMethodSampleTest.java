package practise.testng;

import org.testng.annotations.Test;

public class DependsOnMethodSampleTest {
	@Test
	public void createOrderTest()

	{
		System.out.println("Execute create order");
		String str=null;
		System.out.println(str.equals("123"));
	}
	
	@Test(dependsOnMethods = "createOrderTest")
	public void billingOrderTest()
	{
		System.out.println("Exceute billing order");
	}
}
