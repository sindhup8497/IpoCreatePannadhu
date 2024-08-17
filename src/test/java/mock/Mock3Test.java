package mock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mock3Test {
	@Test
	public void criccTest()
	{
		
WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		driver.get("https://www.cricbuzz.com/");
		
		WebElement ratings = driver.findElement(By.xpath("//a[text()='Rankings']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(ratings).perform();
		
	   driver.findElement(By.xpath("//a[text()='ICC Rankings - Men']")).click();
	   
	  // String player=driver.findElement(By.xpath("//div[@class='cb-col cb-col-100 cb-plyr-tbody']/child::div/child::div/following-sibling::div[3]")).getText();
		
	   String player=driver.findElement(By.xpath("//div[@class='cb-col cb-col-100 cb-plyr-tbody']/child::div/child::div[4]")).getText();
		System.out.println(player);	
		
	}
}


////a[text()='Daryl Mitchell']/../../../..

//div[@class='cb-col cb-col-100 cb-plyr-tbody']/child::div/child::div/following-sibling::div[3]