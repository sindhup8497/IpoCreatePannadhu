package practise.testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.comcast.crm.generic.fileutility.ExcelUtility;

public class GetProductInfoTest2 {
	
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
	public Object[][] getData() throws Exception
	{
		ExcelUtility eLib= new ExcelUtility();
		
		int rowCount =eLib.getRowCount("Sheet2");
		
		
		Object[][] objArr= new Object[rowCount][2];
		for(int i = 0;i<rowCount;i++)
		{
		objArr[i][0]=eLib.readDataFromExcel("Sheet2", i+1, 0);
		objArr[i][1]=eLib.readDataFromExcel("Sheet2", i+1, 1);
		}

		
	
		return objArr;
		
	}
}
