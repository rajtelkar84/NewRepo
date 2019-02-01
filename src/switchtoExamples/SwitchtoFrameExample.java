package switchtoExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchtoFrameExample {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "F:\\New folder\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.get("http://demo.guru99.com/test/guru99home/"); 
	       // navigates to the page consisting an iframe

	       driver.manage().window().maximize();
	       driver.switchTo().frame("a077aa5e"); //switching the frame by ID

			System.out.println("********We are switch to the iframe*******");
			
			Thread.sleep(2000);
     		driver.findElement(By.xpath("html/body/a/img")).click();
  		    //Clicks the iframe
       
  			System.out.println("*********We are done***************");
      }

}
