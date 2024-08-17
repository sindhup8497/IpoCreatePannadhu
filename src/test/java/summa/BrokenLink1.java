package summa;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class BrokenLink1 {
	public static void main(String[] args) throws Throwable {
		URL url=new URL("https://example.com/nonexistent-page");
		HttpURLConnection conn= (HttpURLConnection)url.openConnection();
		int code=conn.getResponseCode();
		System.out.println(code);
		String ms=conn.getResponseMessage();
		System.out.println(ms);
		
		
	    
		
	}

}
