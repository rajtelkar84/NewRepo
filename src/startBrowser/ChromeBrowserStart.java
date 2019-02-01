package startBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserStart{
	
	public static WebDriver driver;

public static void main(String args[])

{
	System.setProperty("webdriver.chrome.driver", "F:\\New folder\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.get("http://www.google.co.in");
	
	
	driver.close();
	System.out.println("hi");

}



}


