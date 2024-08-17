package mock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MockTest2 {
	@Test
	public void qspiderLoginTest() throws InterruptedException
	{
		WebDriver d= new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		d.get("https://demoapps.qspiders.com/ui/frames?sublist=0");
		
		
		//WebElement logIn=d.findElement(By.xpath("//h2[text()='Login']"));
		
		WebElement frame=d.findElement(By.xpath("//iframe[@class=\"w-full h-96\"]"));
		d.switchTo().frame(frame);
		
		d.findElement(By.id("username")).sendKeys("admin");
		
		d.findElement(By.id("password")).sendKeys("admin");
		
		d.findElement(By.xpath("//button[@id='submitButton']")).click();
		
		
		//d.findElement(By.xpath("//section[text()='Frames']")).click();
		
		
		
		
	}

}
