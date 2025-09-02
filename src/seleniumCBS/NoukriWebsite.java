package seleniumCBS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class NoukriWebsite {

	public static void main(String[] args) throws InterruptedException  {
		
		String EmailID = "channaveerswamy.job@gmail.com";
		String Password = "@Cbswamy4456";
		String profile_name = "Channaveer";
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\136.0.7103.49 chromedriver-win64\\chromedriver-win64");
        WebDriver driver = new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://google.com");
      
		  driver.navigate().to("https://www.naukri.com/");
	        driver.findElement(By.xpath("//a[@title='Jobseeker Login' and @id='login_Layer']")).click();
	        driver.findElement(By.xpath("//input[starts-with(@placeholder, 'Enter your active Email ID')]")).sendKeys(EmailID);
	        driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(Password);
	        driver.findElement(By.cssSelector("button[type='submit']")).click();
	        Thread.sleep(5000);
	        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='info__heading']")).getText(), profile_name);
	        System.out.println(driver.findElement(By.cssSelector("div[class='info__heading']")).getText());
	        
	        //clicking on view profile
//	        driver.findElement(By.xpath("//div[@class=\"view-profile-wrapper\"]//*[starts-with(text(), \"View\")]")).click();
	        
//	        //scroll and update the resume headline
//	        WebElement headline_edit = driver.findElement(By.xpath("(//div[@class='widgetHead']//span[normalize-space()='editOneTheme'])[1]"));
//	     // Scroll into view
//	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", headline_edit);
//	        
//	        headline_edit.click();
//	        		
	        
	        //search_bar handle
	        driver.findElement(By.xpath("//span[text()='Search jobs here']")).click();
	        

}
}
