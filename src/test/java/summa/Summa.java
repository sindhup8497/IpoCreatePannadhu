package summa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Summa {
	@Test
	public void test1()
	{
		//from git
	WebDriver d= new ChromeDriver();
	d.get("https://demowebshop.tricentis.com/");
	List<WebElement> radio=d.findElements(By.xpath("//ul[@class='poll-options']/descendant::input[@type='radio']"));
	System.out.println(radio.size());
	for(WebElement e : radio)
	{
	e.click();
	if(e.isSelected())
	{
		System.out.println("Selected");
	}else
	{
		System.out.println("Not selected");
	}
	}
	}

}
