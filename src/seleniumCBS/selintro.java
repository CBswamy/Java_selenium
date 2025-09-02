package seleniumCBS;

import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selintro{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CHROME-chromeDriver --> Methods
		//Firefox- FirefoxDriver-->Methods
		
		//webdriver methods+ class methods
		// selenium manager
		
		
		//System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\136.0.7103.49 chromedriver-win64\\chromedriver-win64");
		
          WebDriver driver = new ChromeDriver();
          
          
//          Firefox launch
          // gecko driver
          
          //Webdriver.gecko.driver
          System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver-v0.36.0-win-aarch64\\geckodriver.exe");
          WebDriver driver1 = new FirefoxDriver();
          
          
          //like same as firefox and chrome we have to write for the edge browser 
          
          
          
          driver.get("https://dev.96meridian.com/");
          System.out.println(driver.getTitle());
          System.out.println(driver.getCurrentUrl());
          
          
          
//          driver.close();
////          driver.quit();
          
          
          
          
          
          
          
          
          
          
		
	}

}
