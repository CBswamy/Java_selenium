package seleniumCBS;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class fluentWaitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver",  "D:\\Selenium\\136.0.7103.49 chromedriver-win64\\chromedriver-win64");
		
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
    
    driver.findElement(By.xpath("//div[@id='start']/button")).click();
    WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
	w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()=\"Hello World!\"]")));
	
	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5))
	 .pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
	 
	WebElement foo =Wait.Until(new Function<>)
    
    driver.close();
	}

}
