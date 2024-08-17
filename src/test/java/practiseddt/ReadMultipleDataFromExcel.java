package practiseddt;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.DataFormatException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadMultipleDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File file=new File("E:\\SeleniumCRMGUIFramework\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		  XSSFSheet sh=wb.getSheet("Sheet1");
		
		  for(int i = 0;i<=sh.getLastRowNum();i++)
		  {
			  DataFormatter formate=new DataFormatter() ;
			  XSSFRow row = sh.getRow(i);
			  XSSFCell c1=row.getCell(0);
			  XSSFCell c2=row.getCell(1);
			  XSSFCell c3=row.getCell(2);
			  String Column1Data1=formate.formatCellValue(c1);
			  String Column1Data2=formate.formatCellValue(c2);
			  String Column1Data3=formate.formatCellValue(c3);
			 
			  System.out.println(Column1Data1+" : "+Column1Data2+" : "+Column1Data3);
			  
		  }
	}

}
