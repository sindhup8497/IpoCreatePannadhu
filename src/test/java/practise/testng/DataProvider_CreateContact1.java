package practise.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_CreateContact1 {
	@Test(dataProvider ="getData" )
	public void createContactTest(String firstName,String lastName, long phoneNumber)
	{
	System.out.println("Firstname :"+firstName+ ","+ " Lastname :"+lastName+" Contact Number :"+phoneNumber);	
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] objArr= new Object[3][3];
		objArr[0][0]="Sindhu";
		objArr[0][1]="P";
		objArr[0][2]=8754992798L;
		
		objArr[1][0]="Mithran";
		objArr[1][1]="A";
		objArr[1][2]=8754992799L;
		
		objArr[2][0]="Arjun";
		objArr[2][1]="P";
		objArr[2][2]=8754992788L;
		return objArr;
		
	}

}
