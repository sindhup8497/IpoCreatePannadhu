package practise.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderCreateContact {
	@Test(dataProvider="getData")
	public void createContact(String firstName, String lastName)

	{
		System.out.println("Firstname : "+firstName+","+"Lastname :"+lastName);
		
	}@DataProvider
	public Object[][] getData()
	{
		Object[][] objArr= new Object[3][2];
		objArr[0][0]="Jayanthi";
		objArr[0][1]="P";
		
		objArr[1][0]="Ponnuvelu";
		objArr[1][1]="S";
		
		objArr[2][0]="Sudha";
		objArr[2][1]="A";
		
		return objArr;
		
	}

		
		
}
