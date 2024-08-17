package practiseddt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;



import java.sql.Statement;
import com.mysql.jdbc.Driver;



public class JDBCRead {
	public static void main(String[] args) throws SQLException {
		//step 1 : load or register the database driver
		Driver driverRef= new Driver();
		DriverManager.registerDriver(driverRef);
		//step 2 : Connect to the database
		Connection conn =DriverManager.getConnection("jdbc:mySql://106.51.90.215:3333/projects", "root@%", "root");
		//url = "jdbc:mySql://106.51.90.215:3333/projects"
		//System.out.println("Done");
		//step 3 : create sql statement
	    Statement stat=conn.createStatement();
	    
	    //step 4 : Exceute select query and execute the result
	    ResultSet resultset=stat.executeQuery("Select * from project");
	    while(resultset.next())
	    {
	    	System.out.println(resultset.getString(1)+"\t"+resultset.getString(2)+"\t"+resultset.getString(3));
	    }
	    //step 5 : Close the connection
	    conn.close();
	    System.out.println("End of the program");
	   
	}
	

}
