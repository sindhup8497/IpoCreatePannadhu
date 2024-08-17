package practiseddt;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class CreateOrgSheet {
	public static void main(String[] args) throws IOException, InterruptedException {
		//Reading comm data from Properties file
		FileInputStream fis = new FileInputStream("C:\\Users\\arjun\\OneDrive\\Desktop\\CommonData1.properties");
		Properties pObj = new Properties();
		pObj.load(fis);
		String BROWSER = pObj.getProperty("Browser");
		String URL = pObj.getProperty("Url");
		String USERNAME = pObj.getProperty("Username");
		String PASSWORD = pObj.getProperty("password");
		//Reading test script data from excel
		FileInputStream fis1 = new FileInputStream("C:\\Users\\arjun\\OneDrive\\Desktop\\New folder\\Book2.xlsx");
		Workbook wb = WorkbookFactory.create(fis1);
		Sheet sh =wb.getSheet("Sheet1");
		Row  row=sh.getRow(1);
		String orgName=row.getCell(2).toString();
		wb.close();
		String brow="BROWSER";
		
		WebDriver d = null;
		if(brow.equals("chrome"))
		{
			d=new ChromeDriver();
		}else if(brow.equals("Edge"))
		{
			d= new EdgeDriver();
		}else 
		{
			d=new ChromeDriver(); 
		}
		//Step 1  : Login to application
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		d.get(URL);
		d.findElement(By.xpath("//input[@name='user_name']")).sendKeys(USERNAME);
		d.findElement(By.xpath("//input[@name='user_password']")).sendKeys(PASSWORD);
		d.findElement(By.xpath("(//input[@value='Login'])[2]")).click();
		
		//Step 2 :  Navigate to Organization mode 
		d.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		
		//Step 3 : Click on create organisation button
		d.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		
		//Step 4 : Enter all the details and create new organization
		d.findElement(By.xpath("//input[@name='accountname']")).sendKeys(orgName);
		d.findElement(By.xpath("(//input[@class='crmbutton small save'])[2]")).click();
		Thread.sleep(3000);
		
		//Step 5 : Logout
	
		Actions a = new Actions(d);
		a.moveToElement(d.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"))).perform();
		d.findElement(By.xpath("//a[text()='Sign Out']")).click();
		System.out.println("Executed");	
		
	}

}
