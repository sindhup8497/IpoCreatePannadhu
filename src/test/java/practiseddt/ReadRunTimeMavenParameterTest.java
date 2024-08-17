package practiseddt;

import org.testng.annotations.Test;

public class ReadRunTimeMavenParameterTest
{

	@Test
	public void mavenDemo()
	{
		String BROWSER=System.getProperty("browser");
		String URL=System.getProperty("url");
		String USERNAME=System.getProperty("username");
		String PASSWORD=System.getProperty("password");
		
		//System.out.println(BROWSER+"\t"+USERNAME+"\t"+URL+"\t"+PASSWORD);
		
		//Web
	}

}
