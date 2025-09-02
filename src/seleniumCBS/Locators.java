package seleniumCBS;

import org.openqa.selenium.By;
// Create WebDriverWait object
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import  java.time.Duration;


public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		Webdriver.gecko.driver
        System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\136.0.7103.49 chromedriver-win64\\chromedriver-win64");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        
        
        //like same as firefox and chrome we have to write for the edge browser 
       driver.get("https://rahulshettyacademy.com/locatorspractice/");
       
//       // Create WebDriverWait object
//       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//       
//       WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inputUsername")));
       
       driver.findElement(By.id("inputUsername")).sendKeys("rahul");
       
       
//       driver.findElement(By.id("inputPassword")).click();
       
       driver.findElement(By.name("inputPassword")).sendKeys("123456");
       driver.findElement(By.className("signInBtn")).click();
       System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
       
       driver.findElement(By.linkText("Forgot your password?")).click();
       Thread.sleep(2000);
      //System.out.println(driver.findElement(By.xpath("//h2[text()='Forgot password']")).getText());
      driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("channaveer");
      driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("channaveer@gmail.com");
      driver.findElement(By.xpath("//button[text()='Reset Login']")).click();
      System.out.println(driver.findElement(By.xpath("//p[@class='infoMsg']")).getText()); //      driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
      driver.findElement(By.xpath("//*[@class='go-to-login-btn']")).click();
      Thread.sleep(5000);
      driver.findElement(By.cssSelector("#inputUsername")).sendKeys("channaveer");
      driver.findElement(By.xpath("//input[starts-with(@type,'pass')]")).sendKeys("rahulshettyacademy");
      
      driver.findElement(By.xpath("//input[@id='chkboxOne']")).click();
    //button[text()='Sign In']
      driver.findElement(By.xpath("//button[text()='Sign In']")).click();
      
//        
//       driver.close();
       
//       WebDriverWait wait = new WebDSriverWait(driver, 10);
//       WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("header-login-primary-button")));
//          WebElement button  = driver.findElement(By.id("header-login-primary-button"));
         
//       sendKeys("channaveer.swamy@waveaxis.com");
	}

}
