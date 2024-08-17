package practise.testng;

import org.testng.annotations.Test;

public class DependsOnMethodSampleTest2 {
	@Test
	public void createContactTest()

	{
		System.out.println("Contact created successfully");
	}
	@Test(dependsOnMethods = "createContactTest")
	public void modifyContactTest()

{
		System.out.println("Modification done successfully");
		}
	@Test(dependsOnMethods = "modifyContactTest")
	public void deleteContactTest()

{
		System.out.println("Deletion done successfully");
		}

}
