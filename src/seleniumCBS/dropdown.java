package seleniumCBS;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\136.0.7103.49 chromedriver-win64\\chromedriver-win64");
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		// Handling the above xpath without index value
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
		driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
//		driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled();
		System.out.println((driver.findElement(By.id("Div1")).getAttribute("style")));
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
         {
			System.out.println("its enabled");
			Assert.assertTrue(true);
		}
         else {
	   Assert.assertTrue(false);
        }
//     	driver.close();
		
		
//		
		
	
	}

}
