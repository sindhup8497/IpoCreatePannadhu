package practise.testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetProductInfoTest {
	@Test
	public void getProductInfoTest()
	{
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://www.amazon.in/");
		//search for product
		d.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iPhone",Keys.ENTER);
		//span[text()='Apple iPhone 15 (128 GB) - Black']/parent::a/parent::h2/parent::div/parent::div/child::div/following-sibling::div/following-sibling::div/child::div/child::div/child::div/child::div/child::div/child::a/child::span/child::span
		//capture product info
		String x="//span[text()='Apple iPhone 15 (128 GB) - Black']/parent::a/parent::h2/parent::div/parent::div/child::div/following-sibling::div/following-sibling::div/child::div/child::div/child::div/child::div/child::div/child::a/child::span/child::span/child::span/following-sibling::span[1]";
	    String price=d.findElement(By.xpath(x)).getText();
		System.out.println(price);
	}

}
