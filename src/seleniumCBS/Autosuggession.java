package seleniumCBS;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggession {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\136.0.7103.49 chromedriver-win64\\chromedriver-win64");
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.xpath("//input[contains(@placeholder, \"Type to Select\")]")).sendKeys("IND");
		Thread.sleep(3000);		
		
		//method to click on india from autosuggession
		// created a array list and the common list element, then for loop explanation (type variable : option)
		List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
	   for(WebElement option : options)
	   {
		   if(option.getText().equalsIgnoreCase("India"))
		   {
			   option.click();
			   break;
		   }
		   	
	   }
	}	

	
}
