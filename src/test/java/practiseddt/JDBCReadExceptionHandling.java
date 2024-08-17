package practiseddt;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class JDBCReadExceptionHandling {
	public static void main(String[] args) throws SQLException {
		Connection conn =null;
		try {
	Driver driverRef= new Driver();
	DriverManager.registerDriver(driverRef);
	 conn =DriverManager.getConnection("jdbc:mySql://106.51.90.215:3333/projects", "root@%", "root");
	 Statement stat=conn.createStatement();
	 ResultSet resultset=stat.executeQuery("Select * from projects");
	    while(resultset.next())
	    {
	    	System.out.println(resultset.getString(1)+"\t"+resultset.getString(2)+"\t"+resultset.getString(3));
	    }
	
		}catch(Exception e )
		{
			System.out.println("Handle Exception");
		}
		finally {
			conn.close();
			System.out.println("Connection closed");
		}
	
	
	}
}
