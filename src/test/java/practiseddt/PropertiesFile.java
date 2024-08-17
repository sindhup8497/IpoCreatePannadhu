package practiseddt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesFile {
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://demowebshop.tricentis.com/");
		d.findElement(By.xpath("//a[@class='ico-login']")).click();
		d.findElement(By.xpath("//input[@class='email']")).sendKeys("sindhuponvel@gmail.com");
		d.findElement(By.xpath("//input[@class='password']")).sendKeys("12345678");
		d.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		
	}

}
