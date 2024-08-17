package summa;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification {
	public static void main(String[] args) {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		WebDriver d= new ChromeDriver(op);
		d.get("https://www.amazon.in/");
		d.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone",Keys.ENTER);
		d.findElement(By.xpath("//span[text()='Apple iPhone 15 (128 GB) - Black']")).click();
		String parent=d.getWindowHandle();
		
		Set<String> set=d.getWindowHandles();
		Iterator<String> it= set.iterator();
		while(it.hasNext()) {
			String windowID=it.next();
			d.switchTo().window(windowID);
			String actualTitle=d.getCurrentUrl();
			if(actualTitle.contains("https://www.amazon.in/Apple-iPhone-15-128-GB"))
			{
				String txt=d.findElement(By.xpath("//span[contains(.,'Apple iPhone 15 (128 GB) - Black')]")).getText();
				System.out.println(txt);
			}
		}
		
	}

}
