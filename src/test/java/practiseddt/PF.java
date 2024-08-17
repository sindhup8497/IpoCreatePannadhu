package practiseddt;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PF {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\arjun\\OneDrive\\Desktop\\CD.properties");
		Properties pObj = new Properties();
		pObj.load(fis);
		String Browser=pObj.getProperty("browser");
		String URL=pObj.getProperty("url");
		String MAIL=pObj.getProperty("mail");
		String PWD=pObj.getProperty("pwd");
		WebDriver d = new ChromeDriver();
		d.get(URL);
		d.findElement(By.xpath("//a[@class='ico-login']")).click();
		d.findElement(By.xpath("//input[@class='email']")).sendKeys(MAIL);
		d.findElement(By.xpath("//input[@class='password']")).sendKeys(PWD);
		d.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		
	}

}
