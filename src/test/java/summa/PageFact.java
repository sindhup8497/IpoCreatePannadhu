package summa;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class PageFact {
	
	@FindBy(name="user_name")
    WebElement userName;
    
    @FindBy(name="user_password")
    WebElement password;
    
    @FindBy(id="submitButton")
    WebElement login;
    
    @Test
    public void sampleTest()
    {
    	FirefoxOptions op= new FirefoxOptions();
    	//ChromeOptions op= new ChromeOptions();
    	//op.addArguments("headless");
    	//op.setHeadless(true);
    	op.addArguments("--disable-notifications");
    	op.addArguments("--start-maximized");
    	op.addArguments("--start-maximized");
    WebDriver d = new FirefoxDriver(op);
    d.get("http://localhost:8888/");
    
PageFact pf= PageFactory.initElements(d, PageFact.class);

pf.userName.sendKeys("admin");
pf.password.sendKeys("admin");
d.navigate().refresh();
pf.userName.sendKeys("admin");
pf.password.sendKeys("admin");
pf.login.click();
}
	

}
