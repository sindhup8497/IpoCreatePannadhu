package practise.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class SampleTest {
	//@Ignore
	@Test(enabled=false)
	public  void test1()
	{
		System.out.println("Test1 executed");
	}
	@Test
	public  void CreateConact()
	{
		System.out.println("Contact created successfully");
	}

}
