package summa;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class BrokenLink {
	public static void main(String[] args) throws Throwable {
		URL url= new URL("https://demowebshop.tricentis.com/");
		HttpURLConnection conn= (HttpURLConnection)url.openConnection();
		int code=conn.getResponseCode();
		System.out.println(code);
		
		String resp=conn.getResponseMessage();
		System.out.println(resp);
		
		
	}

}
