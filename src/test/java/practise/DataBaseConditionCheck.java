package practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.testng.Assert;

import com.mysql.jdbc.Driver;

public class DataBaseConditionCheck {
	public static void main(String[] args) throws SQLException {
		String expectedProjName="INSTAGRAM10";
		boolean flag = false;
		
		Driver driverRef=new Driver();
		DriverManager.registerDriver(driverRef);
	     Connection conn=DriverManager.getConnection("jdbc:mySql://106.51.90.215:3333/projects","root@%","root");
	    java.sql.Statement stat=conn.createStatement();
	    ResultSet resultset=stat.executeQuery("select * from project");
	    while(resultset.next())
	    {
	    	String actProjectName=resultset.getString(4);
	    	if(actProjectName.equals(expectedProjName))
	    	{
	    		flag= true;
	    		System.out.println("Project is found");
	    	}
	    }
	    if(false)
	    {
	    	System.err.println("Project mismatch");
	    	Assert.fail();
	    }
	    conn.close();
	    System.out.println("End of the Execution");
	}

}
