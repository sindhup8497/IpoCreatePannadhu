package practiseddt;

import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDatabasedOnCondition {
	public static void main(String[] args) throws  IOException {
		String data="";
		String expectedtestId="tc_02";
		
		FileInputStream fis = new FileInputStream("C:\\Users\\arjun\\OneDrive\\Desktop\\New folder\\Book2.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh =wb.getSheet("Sheet1");
		
		int rowCount = sh.getLastRowNum();
		for(int i = 0;i<=rowCount;i++)
		{
			
			 data =sh.getRow(i).getCell(1).toString();
			
			
			System.out.println(data);}
		
	}

}
