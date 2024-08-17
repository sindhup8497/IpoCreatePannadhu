package summa;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Swiggy {
	@Test
	public void ss() throws IOException {
	WebDriver d= new ChromeDriver();
	
	int count=0;
	d.get("https://www.swiggy.com/instamart");
	
	List<WebElement> el=d.findElements(By.xpath("//div[text()='Fresh Vegetables']/ancestor::div[@class='rKVoK _1kbVF']/descendant::div[@class='_3aZ5w _1eWs7']"));
	for(WebElement e :el)
	{
		
		File src=e.getScreenshotAs(OutputType.FILE);
		File dest=new File("./swiggyss"+count+".png");
		FileUtils.copyFile(src, dest);
		count++;
	}
	System.out.println("==END==");

}
}