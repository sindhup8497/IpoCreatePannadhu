package practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class WriteDataIntoDataBase {
	public static void main(String[] args) throws Exception {
		Driver driverRef=new Driver();
		DriverManager.registerDriver(driverRef);
	    Connection conn=DriverManager.getConnection("jdbc:mySql://106.51.90.215:3333/projects","root@%","root");
	    java.sql.Statement stat=conn.createStatement();
	    int data=stat.executeUpdate("insert into project values('TY_PROJ_2029','SINDHU','04/27/2024','INSTAGRAM10','On going','100');");
	    System.out.println(data);
	}

}
