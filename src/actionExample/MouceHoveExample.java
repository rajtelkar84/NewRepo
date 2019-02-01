package actionExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouceHoveExample {
	
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\New folder\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		driver.get("http://www.myntra.com/");

	      // Maximize Window
	      driver.manage().window().maximize();

	      // Mouse Over On " Men link "
	      Actions act = new Actions(driver);
	      
	      WebElement test = driver.findElement(By.linkText("Men"));
	      act.moveToElement(test).build().perform();
	      
	      Thread.sleep(5000);

	      // Click on " bags & backpacks " link
	      driver.findElement(By.linkText("Bags & Backpacks")).click();

	      
	      // Closing current driver window
	      driver.close();
 

	}

}
