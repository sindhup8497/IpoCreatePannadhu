package practiseddt;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class ReadDataFromTestNgXmlTest 

{
	@Test
	public void sampleMethod(XmlTest test)
	{
		System.out.println("sample");
		System.out.println(test.getParameter("browser"));
		System.out.println(test.getParameter("url"));
		System.out.println(test.getParameter("username"));
		System.out.println(test.getParameter("password"));
	}


}
