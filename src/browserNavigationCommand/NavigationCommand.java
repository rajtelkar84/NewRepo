package browserNavigationCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommand {
	
	public static WebDriver driver;
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\New folder\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		String appUrl = "https://www.facebook.com/";
		driver.get(appUrl);
		
		Thread.sleep(5000);
 
		
		
		// Click on Registration link
		driver.findElement(By.partialLinkText("Forgotten account?")).click();
		
		//driver.findElement(By.id("email")).sendKeys("abc");
		
		Thread.sleep(5000);
 
		// Go back to Home Page
		driver.navigate().back();
		
		Thread.sleep(5000);
 
		// Go forward to Registration page
		driver.navigate().forward();
		
		Thread.sleep(5000);
 
		// Go back to Home page
		driver.navigate().to(appUrl);
		Thread.sleep(5000);
 
		// Refresh browser
		driver.navigate().refresh();
		
		Thread.sleep(5000);
 
		// Close browser
		driver.close();

	}

}
