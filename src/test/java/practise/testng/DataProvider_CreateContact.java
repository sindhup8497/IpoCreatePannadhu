package practise.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_CreateContact {
	
	@Test(dataProvider ="getData" )
	public void createContactTest(String firstName,String lastName)
	{
	System.out.println("Firstname :"+firstName+ " and "+ " Lastname :"+lastName);	
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] objArr= new Object[3][2];
		objArr[0][0]="Sindhu";
		objArr[0][1]="P";
		
		objArr[1][0]="Mithran";
		objArr[1][1]="A";
		
		objArr[2][0]="Arjun";
		objArr[2][1]="P";
		return objArr;
		
	}

}
