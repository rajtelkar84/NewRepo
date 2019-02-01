package radioButtonAndCheckBox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonCheckBox {

	public static WebDriver driver;
	 
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\New folder\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		
		driver.findElement(By.id("novels-radio-btn")).click();
		
	
		List<WebElement> rdBtn_books = driver.findElements(By.name("books"));
		
		boolean bValue = false;
		
		bValue = rdBtn_books.get(0).isSelected();
		
		
		if(bValue == true){
			
			rdBtn_books.get(1).click();
		}else{
			
			rdBtn_books.get(0).click();
		}
		
		
		WebElement rdBtn_Exp = driver.findElement(By.id("novels-radio-btn"));
		rdBtn_Exp.click();
		
		
		List<WebElement> chkBx_Profession = driver.findElements(By.xpath("//*[@type='checkbox']"));
		
		
		int iSize = chkBx_Profession.size();
		
		
		for(int i=0; i < iSize ; i++ ){
			
			String sValue = chkBx_Profession.get(i).getAttribute("value");
			System.out.println(sValue);
			
			if (sValue.equalsIgnoreCase("SUV")){
				chkBx_Profession.get(i).click();
			
			break;
			}
		}
		WebElement oCheckBox = driver.findElement(By.cssSelector("input[value='Truck']"));
		oCheckBox.click();
		
		// Kill the browser
		driver.quit();
 
	}
 
}
