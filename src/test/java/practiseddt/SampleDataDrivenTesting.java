package practiseddt;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class SampleDataDrivenTesting {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\arjun\\OneDrive\\Desktop\\CD.properties");
		Properties pObj = new Properties();
		pObj.load(fis);
		System.out.println(pObj.getProperty("url"));
		
	}

}
