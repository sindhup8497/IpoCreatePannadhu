package practise.testng;

import org.testng.annotations.Test;

public class PriorityContactTest {
	@Test(priority='a')
	public void createContactTest()

	{
		System.out.println("Contact created successfully");
	}
	@Test(priority='z')
	public void modifyContactTest()

{
		System.out.println("Modification done successfully");
		}
	@Test(priority='t')
	public void deleteContactTest()

{
		System.out.println("Deletion done successfully");
		}
}
