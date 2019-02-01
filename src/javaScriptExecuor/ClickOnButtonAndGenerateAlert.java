package javaScriptExecuor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnButtonAndGenerateAlert {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\New folder\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;	
		
		
        //Launching the Site.		
        driver.get("http://demo.guru99.com/V4/");		
        
       // js.executeScript("alert('Welcome to Guru99');"); 
        		
        WebElement button =driver.findElement(By.name("btnLogin"));			
        		
        //Login to Guru99 		
        driver.findElement(By.name("uid")).sendKeys("mngr34926");					
        driver.findElement(By.name("password")).sendKeys("amUpenu");	
        
        
        		
        //Perform Click on LOGIN button using JavascriptExecutor		
        js.executeScript("arguments[0].click();", button);
                               
        //To generate Alert window using JavascriptExecutor. Display the alert message 			
          driver.close();
    		
    }		


	}


