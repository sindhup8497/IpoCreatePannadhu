package practise.testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GetProductInfoTest1 {
	@Test(dataProvider = "getData")
	public void getProductInfoTest(String brandName,String productName)
	{
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://www.amazon.in/");
		//search for product
		d.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(brandName,Keys.ENTER);
		
		String x="//span[text()='"+productName+"']/parent::a/parent::h2/parent::div/parent::div/child::div/following-sibling::div/following-sibling::div/child::div/child::div/child::div/child::div/child::div/child::a/child::span/child::span/child::span/following-sibling::span[1]";
	    String price=d.findElement(By.xpath(x)).getText();
		System.out.println(price);
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] objArr= new Object[3][2];
		objArr[0][0]="iPhone";
		objArr[0][1]="Apple iPhone 15 (128 GB) - Black";
		
		
		objArr[1][0]="Vivo";
		objArr[1][1]="Redmi Note 13 5G (Arctic White, 6GB RAM, 128GB Storage) | 5G Ready | 120Hz Bezel-Less AMOLED | 7.mm Slimmest Note Ever | 108MP Pro-Grade Camera";
		
		
		objArr[2][0]="vivo";
		objArr[2][1]="Vivo T2x 5G (128 GB) (6 GB RAM) (Aurora Gold)";
	
		return objArr;
		
	}
	

}
