package practiseddt;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Polymorphism {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\arjun\\OneDrive\\Desktop\\CD.properties");
		Properties pObj = new Properties();
		pObj.load(fis);
		String Browser=pObj.getProperty("browser");
		String URL=pObj.getProperty("url");
		String MAIL=pObj.getProperty("mail");
		String PWD=pObj.getProperty("pwd");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the browser to launch");
		String brow=sc.next();
		WebDriver d = null;
		if(brow.equals("chrome"))
		{
	     d = new ChromeDriver();	
		}else if(brow.equals("Edge"))
		{
			d=new EdgeDriver();
		}
		else 
		{
			d =  new ChromeDriver();
		}
		//WebDriver d = new ChromeDriver();
		d.get(URL);
		d.findElement(By.xpath("//a[@class='ico-login']")).click();
		d.findElement(By.xpath("//input[@class='email']")).sendKeys(MAIL);
		d.findElement(By.xpath("//input[@class='password']")).sendKeys(PWD);
		d.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	}

}
