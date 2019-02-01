package alertExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SimpleAlertExample {
	
	public static WebDriver driver;
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "F:\\New folder\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		driver.manage().window().maximize();
		// This step will result in an alert on screen
		driver.findElement(By.id("alertBox")).click();
 
		Alert simpleAlert = driver.switchTo().alert();
		String alertText = simpleAlert.getText();
		
		System.out.println("Alert text is " + alertText);
		simpleAlert.accept();
		
		
		
		driver.close();
	}

}

