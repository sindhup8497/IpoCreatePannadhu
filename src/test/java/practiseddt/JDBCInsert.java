package practiseddt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class JDBCInsert {
	public static void main(String[] args) throws SQLException {
		Driver driverRef= new Driver();
		DriverManager.registerDriver(driverRef);
		Connection conn =DriverManager.getConnection("jdbc:mySql://106.51.90.215:3333/projects", "root@%", "root");
		 Statement stat=conn.createStatement();
		 //step 4 : insert the query into the table and get result
		 int result =  stat.executeUpdate("insert into project values('TY_PROJ_2024','SINDHU','04/27/2024','INSTAGRAm','On going','100');");
		 System.out.println(result);
		 conn.close();
	}

}
