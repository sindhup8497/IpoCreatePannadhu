package practiseddt;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ReadDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		//Step 1 : Get the excel path location and java object of the physical Excelfile
		File file=new File("C:\\Users\\arjun\\OneDrive\\Desktop\\New folder\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(file);
		//Step 2 : set/open the workbook in read  mode

       Workbook wb=  WorkbookFactory.create(fis);	
       //Step 3 : Get the control of the sheet
       Sheet sh = wb.getSheet("Sheet1");
       
       //step 4 : Get the control of row which you want
       Row row=sh.getRow(3);
       
       //step 5 : Get the control of the cell we want and get the string data
       Cell cell = row.getCell(1);
       String data =cell.getStringCellValue();
       System.out.println(data);
       //code optimization
       String data1= row.getCell(0).getStringCellValue();
       System.out.println(data1);
//       double data2= row.getCell(3).getNumericCellValue();
//       System.out.println(data2);
       String dat= row.getCell(2).toString();
       System.out.println(dat);
       
       //step 6 : Close the workbook
       wb.close();
       
	}

}
