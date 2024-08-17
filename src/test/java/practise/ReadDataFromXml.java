package practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class ReadDataFromXml {
	@Test
	public static void ReadData(XmlTest test)
	{
	String BROWSER=test.getParameter("Browser");
	String URL=test.getParameter("Url");
	String USERNAME=test.getParameter("Username");
	String PASSWORD=test.getParameter("Password");
	
	String brow=BROWSER;
	WebDriver d = null;
	if(brow.equals("Chrome"))
	{
		d=new ChromeDriver();
	}else if(brow.equals("Edge"))
	{
		d= new EdgeDriver();
	}else
	{
		d= new FirefoxDriver();
	}
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	d.get(URL);
	d.findElement(By.xpath("//input[@name='user_name']")).sendKeys(USERNAME);
	d.findElement(By.xpath("//input[@name='user_password']")).sendKeys(PASSWORD);
	d.findElement(By.xpath("//input[@id='submitButton']")).click();
	
	
}	
		
		
	}


