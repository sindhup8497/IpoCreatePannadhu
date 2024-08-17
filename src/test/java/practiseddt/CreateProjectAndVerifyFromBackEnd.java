package practiseddt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.mysql.jdbc.Driver;

public class CreateProjectAndVerifyFromBackEnd {
	public static void main(String[] args) throws SQLException {
		//create project in GUI
		String projectName="MyFaceBook";
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		d.get("http://106.51.90.215:8084/");
		d.findElement(By.id("username")).sendKeys("rmgyantra");
		d.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
		d.findElement(By.xpath("//button[@type='submit']")).click();
		d.findElement(By.xpath("//a[text()='Projects']")).click();
		d.findElement(By.xpath("//span[text()='Create Project']")).click();
		//d.findElement(By.xpath("//a[text()='Projects']")).click();
		d.findElement(By.xpath("//input[@name='projectName']")).sendKeys(projectName);
		d.findElement(By.xpath("//input[@name='createdBy']")).sendKeys("Sindhuponvel");
		Select s= new Select(d.findElement(By.xpath("(//select[@name='status'])[2]")));
		s.selectByIndex(2);
		d.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		//verify the project in db
		boolean flag = false;
		Driver driverRef= new Driver();
		DriverManager.registerDriver(driverRef);
		Connection conn =DriverManager.getConnection("jdbc:mySql://106.51.90.215:3333/projects", "root@%", "root");
		Statement stat=conn.createStatement();
		ResultSet resultset=stat.executeQuery("Select * from project");
		while(resultset.next())
		{
			String actualProjectName=resultset.getString(4);
			if(projectName.equals(actualProjectName))
			{
				flag = true;
				System.out.println(projectName+ " is available in DB==PASS");
			}
		}
		if(flag==false)
		{
			System.out.println(projectName+ " is not available in DB==FAIL");
			
		}
		conn.close();
		System.out.println("Program executed successfully");
		  
	}

}
