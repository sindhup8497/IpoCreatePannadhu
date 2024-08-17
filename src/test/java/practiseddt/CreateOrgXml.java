package practiseddt;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class CreateOrgXml {
     @Test
     public void CreateOrg(XmlTest test) throws InterruptedException, IOException {
		//Reading comm data from Properties file
				
				String BROWSER =test.getParameter("browser");
				String URL = test.getParameter("url");
				String USERNAME = test.getParameter("username");
				String PASSWORD = test.getParameter("password");
				String brow="BROWSER";
				
				WebDriver d = null;
				if(brow.equals("chrome"))
				{
					d=new ChromeDriver();
				}else if(brow.equals("Edge"))
				{
					d= new EdgeDriver();
				}else 
				{
					d=new ChromeDriver(); 
				}
				//Step 1  : Login to application
				d.manage().window().maximize();
				d.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
				d.get(URL);
				d.findElement(By.xpath("//input[@name='user_name']")).sendKeys(USERNAME);
				d.findElement(By.xpath("//input[@name='user_password']")).sendKeys(PASSWORD);
				d.findElement(By.xpath("(//input[@value='Login'])[2]")).click();
				
				//Step 2 :  Navigate to Organization mode 
				d.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
				
				//Step 3 : Click on create organisation button
				d.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
				
				//Step 4 : Enter all the details and create new organization
				d.findElement(By.xpath("//input[@name='accountname']")).sendKeys("Insta");
				d.findElement(By.xpath("(//input[@class='crmbutton small save'])[2]")).click();
				Thread.sleep(3000);
				
				//Step 5 : Logout
			
				Actions a = new Actions(d);
				a.moveToElement(d.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"))).perform();
				d.findElement(By.xpath("//a[text()='Sign Out']")).click();
				System.out.println("Executed");	
				
				
	}

}
