package practise.pom.respository1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SampleTestWithPOM {
    @FindBy(name="user_name")
    WebElement userName;
    
    @FindBy(name="user_password")
    WebElement password;
    
    @FindBy(id="submitButton")
    WebElement login;
    
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
