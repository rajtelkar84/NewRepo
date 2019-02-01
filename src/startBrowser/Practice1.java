package startBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {
	public static WebDriver driver;
	
	public static void main(String args[])
	
	
	{
		System.setProperty("webdriver.chrome.driver", "F:\\New folder\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		
		
		driver.get("https://www.facebook.com");
		
		
		
		String FBTitle = driver.getTitle();
		
		System.out.println(FBTitle);
		
		
		String FBURL = driver.getCurrentUrl();
		System.out.println(FBURL);
		
		String FBPageSource = driver.getPageSource();
		//System.out.println(FBPageSource);
		//driver.findElement(By.id("lst-ib")).sendKeys("Hello Raj");
		driver.close();
		System.out.println("hi");
	
	}

}
