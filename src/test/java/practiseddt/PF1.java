package practiseddt;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PF1 {
	public static void main(String[] args) throws IOException {
		//create java representation obj of an physical file
		FileInputStream fis = new FileInputStream("C:\\Users\\arjun\\OneDrive\\Desktop\\CD.properties");
		//create an obj fo properties class and load the keys
		Properties pObj = new Properties();
		pObj.load(fis);
		//using getProperty method get all the values of the keys
		String BROSWER=pObj.getProperty("browser");
		String URL=pObj.getProperty("url");
		String MAIL=pObj.getProperty("mail");
		String PWD=pObj.getProperty("pwd");
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the browser to launch");
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
		
		d.get(URL);
		
		
		

		}

}
