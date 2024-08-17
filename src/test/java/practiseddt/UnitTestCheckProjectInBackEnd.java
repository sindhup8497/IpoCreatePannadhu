package practiseddt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mysql.jdbc.Driver;

public class UnitTestCheckProjectInBackEnd {
	@Test
	public void projectCheckTest() throws SQLException
	{
		String expectedProjectName="INSTAGRAM";
		boolean flag = false;
		Driver driverRef= new Driver();
		DriverManager.registerDriver(driverRef);
		Connection conn =DriverManager.getConnection("jdbc:mySql://106.51.90.215:3333/projects", "root@%", "root");
		Statement stat=conn.createStatement();
		ResultSet resultset=stat.executeQuery("Select * from project");
		while(resultset.next())
		{
			String actualProjectName=resultset.getString(4);
			if(expectedProjectName.equals(actualProjectName))
			{
				flag = true;
				System.out.println(expectedProjectName+ " is available==PASS");
			}
		}
		if(flag==false)
		{
			System.out.println(expectedProjectName+ " is not available==FAIL");
			Assert.fail();
		}
		conn.close();
		  
	}
}
