package practise.pom.respository1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTestWihoutPOM {
	
	public static void main(String[] args) {
	
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("http://localhost:8888/");
		WebElement userName=d.findElement(By.name("user_name"));
		WebElement password=d.findElement(By.name("user_password"));
		WebElement login=d.findElement(By.id("submitButton"));
		userName.sendKeys("admin");
		password.sendKeys("admin");
		d.navigate().refresh();
		userName.sendKeys("admin");
		password.sendKeys("admin");
		login.click();
		
		
	}
}
