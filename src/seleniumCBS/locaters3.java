package seleniumCBS;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locaters3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\136.0.7103.49 chromedriver-win64\\chromedriver-win64");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	        
	        
	}

}
