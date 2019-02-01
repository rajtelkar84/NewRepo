package startBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowserStart {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Desktop\\java\\chromeIEFireFoxDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
 
		Thread.sleep(5000);
		driver.quit();
		
		System.out.println("hello");
	}

}


