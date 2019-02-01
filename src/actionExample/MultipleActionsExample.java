package actionExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MultipleActionsExample {
	
	public static WebDriver driver;

   public static void main(String[] args) throws Exception {

      // Initialize WebDriver
		System.setProperty("webdriver.chrome.driver", "F:\\New folder\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

      // Wait For Page To Load
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      // Go to URL
      driver.get("http://www.facebook.com/");

      // Maximize Window
      driver.manage().window().maximize();

      // get the reference for Web Element Email
      WebElement userName = driver.findElement(By.id("email"));

      // Handling Multiple Actions
      Actions act = new Actions(driver);
    
      Action seriesOfActions = act.moveToElement(userName).click().keyDown(userName, Keys.SHIFT)
            .sendKeys(userName, "hello").keyUp(userName, Keys.SHIFT).doubleClick(userName).contextClick().build();
      seriesOfActions.perform();
      
      Thread.sleep(5000);

      // Closing current driver window
      driver.close();
   }
}
