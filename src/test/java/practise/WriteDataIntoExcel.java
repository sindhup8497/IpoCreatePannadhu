package practise;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataIntoExcel {
	
	public static void main(String[] args) throws Exception {
		
		//ExcelUtility eLib = new ExcelUtility();
		
		
		
		FileInputStream fis = new FileInputStream("C:\\Users\\arjun\\OneDrive\\Desktop\\New folder\\Book1.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
		Row row=sh.getRow(0);
		Cell cel=row.createCell(2);
		cel.setCellType(CellType.STRING);
     	cel.setCellValue("STATUS");
		FileOutputStream fos=new FileOutputStream("C:\\\\Users\\\\arjun\\\\OneDrive\\\\Desktop\\\\New folder\\\\Book1.xlsx");
		wb.write(fos);
		wb.close();
		
		
		
		
	}

}
