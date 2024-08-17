package mock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MockTest {
	
	@Test
	public void cricTest()
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		driver.get("https://www.cricbuzz.com/");
		
		WebElement rankings=driver.findElement(By.xpath("//a[text()='Rankings']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(rankings).perform();
		
		driver.findElement(By.xpath("//a[text()='ICC Rankings - Men']")).click();
		
		String playerName=driver.findElement(By.xpath("//a[text()='Kane Williamson']")).getText();
		
		String rating=driver.findElement(By.xpath("//div[text()='859']")).getText();
		
		System.out.println(playerName+" : "+rating);
		
		driver.quit();
		
		
		
	}

}
