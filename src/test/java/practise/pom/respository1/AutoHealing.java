package practise.pom.respository1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AutoHealing {
	 @FindBy(name="user_name")
	    WebElement userName;
	 
	    
	    @FindBy(name="user_password")
	    WebElement password;
	    
//	    @FindAll ({@FindBy(id="submitButton"),@FindBy(xpath="//input[@type='submit']")})
//	    WebElement login;
	    
//	    @FindBys({@FindBy(id="submitButton"),@FindBy(xpath="//input[@type='submit']")})
//	    WebElement login;
	    
	    @Test
		public void sampleTest()
	    {
	    WebDriver d = new ChromeDriver();
	    d.get("http://localhost:8888/");
	    
	    SampleTestWithPOM s= PageFactory.initElements(d,SampleTestWithPOM.class);
	    
	    s.userName.sendKeys("admin");
	    s.password.sendKeys("admin");
	    d.navigate().refresh();
	    s.userName.sendKeys("admin");
	    s.password.sendKeys("admin");
	    s.login.click();
	    
	    }
}
