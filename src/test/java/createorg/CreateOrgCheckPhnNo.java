package createorg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateOrgCheckPhnNo {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\Users\\arjun\\OneDrive\\Desktop\\CommonData1.properties");
		Properties pObj = new Properties();
		pObj.load(fis);
		String BROWSER = pObj.getProperty("Browser");
		String URL= pObj.getProperty("Url");
		String USERNAME = pObj.getProperty("Username");
		String PASSWORD = pObj.getProperty("Password");
		FileInputStream fis1=new FileInputStream("C:\\Users\\arjun\\OneDrive\\Desktop\\New folder\\Book2.xlsx");
		Workbook wb=WorkbookFactory.create(fis1);
		Sheet sh=wb.getSheet("sheet1");
		String orgName=sh.getRow(1).getCell(2).getStringCellValue();
		String phnNo=sh.getRow(1).getCell(4).getStringCellValue();
		wb.close();
	    String brow = BROWSER;
		WebDriver d = null;
		if(brow.equals("Chrome"))
		{
			d =new ChromeDriver();
		}else if(brow.equals("Edge"))
		{
			d= new EdgeDriver();
		}else
		{
			d=new FirefoxDriver();
		}
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get(URL);
		d.findElement(By.xpath("//input[@name='user_name']")).sendKeys(USERNAME);
		d.findElement(By.xpath("//input[@name='user_password']")).sendKeys(PASSWORD);
		d.findElement(By.xpath("(//input[@value='Login'])[2]")).click();
		
	
		d.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();

		
		d.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		
		
		d.findElement(By.xpath("//input[@name='accountname']")).sendKeys(orgName);
		
		d.findElement(By.id("phone")).sendKeys(phnNo);
		
		d.findElement(By.xpath("(//input[@class='crmbutton small save'])[2]")).click();
		
		String actPhnNo=d.findElement(By.xpath("//span[@id='dtlview_Phone']")).getText();
		if(actPhnNo.equals(phnNo))
		{
			System.out.println(phnNo + " is verified");
		}else
		{
			System.out.println(phnNo+" is not verified");
		}
		Thread.sleep(3000);
		d.close();
		
	}

}
