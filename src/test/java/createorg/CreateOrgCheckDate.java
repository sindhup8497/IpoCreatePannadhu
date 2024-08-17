package createorg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class CreateOrgCheckDate {
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
		String lastName=sh.getRow(7).getCell(4).getStringCellValue();
		
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
		d.findElement(By.xpath("//a[text()='Contacts']")).click();
		d.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		
		
		
		d.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastName);
		d.findElement(By.xpath("//input[@name='support_start_date']")).clear();
		d.findElement(By.xpath("//input[@name='support_end_date']")).clear();
		Date dateObj= new Date();
		//System.out.println(dateObj.toString());
		
		SimpleDateFormat sim= new SimpleDateFormat("yyyy-MM-dd");
		String startDate=sim.format(dateObj);
		
		Calendar cal=sim.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH,30);
		String endDate=sim.format(cal.getTime());
		
		d.findElement(By.xpath("//input[@name='support_start_date']")).sendKeys(startDate);
		d.findElement(By.xpath("//input[@name='support_end_date']")).sendKeys(endDate);
		
		
		
		d.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[2]")).click();
		
		
		
		
		String actLastName=d.findElement(By.xpath("//span[@id='dtlview_Last Name']")).getText();
		if(actLastName.equals(lastName))
		{
			System.out.println("LastName  is verified");
		}else
		{
			System.out.println("LastName is not verified");
		}
		
		String actStartDate=d.findElement(By.xpath("//span[@id='dtlview_Support Start Date']")).getText();
		if(actStartDate.equals(startDate))
		{
			System.out.println("Start Date verified successfully");
		}else
		{
			System.out.println("Start Date verification failed ");
		}
		String actEndDate=d.findElement(By.xpath("//span[@id='dtlview_Support End Date']")).getText();
		if(actEndDate.equals(endDate))
		{
			System.out.println("End Date verified successfully");
		}
		else
		{
			System.out.println("End Date verification failed ");	
		}

		Actions a = new Actions(d);
		a.moveToElement(d.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"))).perform();
		d.findElement(By.xpath("//a[text()='Sign Out']")).click();
		d.quit();
		
	}

}
