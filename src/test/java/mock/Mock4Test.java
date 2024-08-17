package mock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Mock4Test {
	
	@Test
	public void amazonTest()
	{
       WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("Samsung");
//		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
//		String x="(//span[@class='a-size-medium a-color-base a-text-normal'])[3]/../../../../child::div/following-sibling::div/following-sibling::div/child::div/child::div/child::div/child::div/child::div/child::a/child::span";
//		String price=driver.findElement(By.xpath(x)).getText();
//		System.out.println(price);
		
	}

}
