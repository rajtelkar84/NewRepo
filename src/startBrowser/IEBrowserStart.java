package startBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowserStart {
	
	public static WebDriver driver;

public static void main(String args[])

{
	System.setProperty("webdriver.ie.driver", "C:\\Users\\user\\Desktop\\java\\chromeIEFireFoxDriver\\IEDriverServer.exe");
	driver = new InternetExplorerDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.get("http://www.google.co.in");
	driver.manage().window().maximize();
	driver.close();
	System.out.println("hi");

}

}


