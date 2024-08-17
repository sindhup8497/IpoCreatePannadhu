package summa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IFrame {
	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
	    d.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
	    int s=d.findElements(By.tagName("iframe")).size();
	    System.out.println(s);
	}

}
