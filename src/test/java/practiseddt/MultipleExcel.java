package practiseddt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MultipleExcel {
  public static void main(String[] args) throws EncryptedDocumentException, IOException {
	  FileInputStream fis = new FileInputStream("C:\\Users\\arjun\\OneDrive\\Desktop\\New folder\\Book1.xlsx");
	  Workbook wb= WorkbookFactory.create(fis);
	  Sheet sh=wb.getSheet("Sheet1");
	  int rowCount=sh.getLastRowNum();
	  for(int i =1;i<=rowCount;i++)
	  {
		  Row row=sh.getRow(i);
		  String data1=row.getCell(0).getStringCellValue();
		  String data2=row.getCell(1).getStringCellValue();
		  System.out.println(data1+" : "+data2);
		  
		  
	  }
	 
}
}
