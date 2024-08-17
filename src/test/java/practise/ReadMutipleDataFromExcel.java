package practise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMutipleDataFromExcel {
	public static void main(String[] args) throws Exception {
      
		FileInputStream fis = new FileInputStream("C:\\Users\\arjun\\OneDrive\\Desktop\\New folder\\Book1.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
		int rowCount= sh.getLastRowNum();
		
		for(int i = 0;i<=rowCount;i++)
		{
		  String data1 = sh.getRow(i).getCell(0).getStringCellValue();
		  String data2=sh.getRow(i).getCell(1).getStringCellValue();
		 //String data3=sh.getRow(i).getCell(3).getStringCellValue();
		  
		  System.out.println(data1+"\t"+data2);
		  
		}
		wb.close();
		
	
	}

}
