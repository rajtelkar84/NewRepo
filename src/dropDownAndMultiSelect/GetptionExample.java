package dropDownAndMultiSelect;

import java.util.concurrent.TimeUnit;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetptionExample {
	
	public static WebDriver driver;
	
	public static void main(String args[]) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "F:\\New folder\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		Select oSelect = new Select(driver.findElement(By.id("selenium_suite")));
		
		List<WebElement> oSize = oSelect.getOptions();
		int iListSize = oSize.size();
 
		// Setting up the loop to print all the options
		for(int i =0; i < iListSize ; i++){
			// Storing the value of the option	
			String sValue = oSelect.getOptions().get(i).getText();
			// Printing the stored value
			System.out.println(sValue);
			// Putting a check on each option that if any of the option is equal to 'Africa" then select it 
			if(sValue.equals("Selenium WebDriver")){
				
				
				oSelect.selectByVisibleText("Selenium WebDriver");;
				break;
				}
			}	    
		// Kill the browser
		Thread.sleep(5000);
		driver.quit();
		}
	}
	
	


