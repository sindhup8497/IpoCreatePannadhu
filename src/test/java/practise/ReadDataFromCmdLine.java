package practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ReadDataFromCmdLine {
	@Test
	public static void ReadFromCmdLine()

	{
		String BROWSER =System.getProperty("Browser");
		String URL=System.getProperty("Url");
		String USERNAME =System.getProperty("Username");
		String PASSWORD =System.getProperty("Password");
		String brow=BROWSER;
		WebDriver d = null;
		if(brow.equals("Chrome"))
		{
			d=new ChromeDriver();
		}else 
		{
			d= new EdgeDriver();
		}
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get(URL);
		d.findElement(By.xpath("//input[@name='user_name']")).sendKeys(USERNAME);
		d.findElement(By.xpath("//input[@name='user_password']")).sendKeys(PASSWORD);
		d.findElement(By.xpath("//input[@id='submitButton']")).click();
		
		
		
	}

}
