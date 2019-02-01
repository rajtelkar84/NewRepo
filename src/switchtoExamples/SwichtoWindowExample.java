package switchtoExamples;

import java.awt.AWTException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwichtoWindowExample {
	
public static WebDriver driver;
	
	public static void main(String args[])throws AWTException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\New folder\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		 
        // Store and Print the name of the First window on the console

        String handle= driver.getWindowHandle();

        System.out.println(handle);

        // Click on the Button "New Message Window"

        driver.findElement(By.id("win1")).click();

        // Store and Print the name of all the windows open	              

        Set handles = driver.getWindowHandles();
        
        System.out.println(handles.size());

        System.out.println(handles);

        // Pass a window handle to the other window

        for (String handle1 : driver.getWindowHandles()) {

        	//System.out.println(handle1);

        	driver.switchTo().window(handle1);
        	

        	}

        // Closing Pop Up window

       driver.close();

        // Close Original window

    //   driver.quit();

}

}

