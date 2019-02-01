package switchtoExamples;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwirchToAlertExample {
	
public static WebDriver driver;
	
	public static void main(String args[])throws AWTException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\New folder\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		 
        // Click on the Button "Alert Box"

        driver.findElement(By.id("confirmBox")).click();

        // Switch to JavaScript Alert window

        Alert myAlert = driver.switchTo().alert();

        // Accept the Alert

        myAlert.accept();

        // Close Original window

      //  driver.close();

}
}

