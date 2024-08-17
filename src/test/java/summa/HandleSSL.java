
package summa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleSSL {
	public static void main(String[] args) {
		ChromeOptions op= new ChromeOptions();
		op.setAcceptInsecureCerts(true);
		WebDriver d= new ChromeDriver(op);
		d.get("https://expired.badssl.com/");
		System.out.println(d.getTitle());
	}

}
