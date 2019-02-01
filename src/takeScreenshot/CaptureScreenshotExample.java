package takeScreenshot;



import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshotExample {
	
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// Initialize WebDriver
				System.setProperty("webdriver.chrome.driver", "F:\\New folder\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
				
				driver.get("https://www.google.co.in");
				 File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				 FileUtils.copyFile(screenshotFile, new File("F:\\capturescreenshotexample.png"));
				 driver.close();
				 driver.quit(); 

	}

}

