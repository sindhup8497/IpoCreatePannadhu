package practiseddt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDatabasedOnConditionMain {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		String expectedTestId="tc_01";
		String data1="";
		String data2="";
		String data3="";
		boolean flag = false;
		
		FileInputStream fis = new FileInputStream("C:\\Users\\arjun\\OneDrive\\Desktop\\New folder\\Book2.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh =wb.getSheet("Sheet1");
		
		int rowCount = sh.getLastRowNum();
		for(int i = 0;i<=rowCount;i++){
			String data="";
		{
			try {	
			 data =sh.getRow(i).getCell(0).toString();
			 if(data.equals(expectedTestId))
			 {
				 flag = true;
				 data1=sh.getRow(i).getCell(1).toString();
				 data2=sh.getRow(i).getCell(2).toString();
				 data3=sh.getRow(i).getCell(3).toString();
				 
			 }
			}catch(Exception e)
			{
			//System.out.println("Handle Exception");
				}}}
		if(flag==true) {
			System.out.println(data1+" : "+data2+" : "+data3);
		}else
		{
			System.out.println(expectedTestId+ " is not available");
		}


	}}
