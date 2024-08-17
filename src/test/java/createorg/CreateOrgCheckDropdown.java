package createorg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateOrgCheckDropdown {
	public static void main(String[] args) throws Exception   {
		Random random= new Random();
		int randomInt=random.nextInt(10);
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
		String ind=sh.getRow(4).getCell(3).getStringCellValue();
		String typ=sh.getRow(4).getCell(4).getStringCellValue();
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
		WebElement indus=d.findElement(By.xpath("//select[@name='industry']"));
		Select sel1=new Select(indus);
		sel1.selectByVisibleText(ind);//reading data from excel sheet
		
		WebElement type1=d.findElement(By.xpath("//select[@name='accounttype']"));
		Select sel2=new Select(type1);
		sel2.selectByValue(typ);//reading data from excel sheet
		
		
		d.findElement(By.xpath("(//input[@class='crmbutton small save'])[2]")).click();
		
	    //verify header msg Expected result
		String headerInfo=d.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		if(headerInfo.contains(orgName))
		{
			System.out.println(orgName + " is created==PASS");
		}else
		{
			System.out.println(orgName + " is not created==FAIL");
		}
	    String actIndustry=d.findElement(By.xpath("//span[@id='dtlview_Industry']")).getText();
	    if(actIndustry.equals(ind))
	    {
	    	System.out.println(ind +" is verfied==PASS");
	    }else
	    {
	    	System.out.println(ind + " verification failed==FAIL");
	    }
	    String actType=d.findElement(By.xpath("//span[@id='dtlview_Type']")).getText();
	    if(actType.equals(typ))
	    {
	    	System.out.println(typ +" is verfied==PASS");
	    }else
	    {
	    	System.out.println(typ+ " verification failed==FAIL");
	    }
	    Thread.sleep(3000);
		d.close();
		
		
		
	}

}
