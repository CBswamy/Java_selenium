package seleniumCBS;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;


public class locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name = "channaveer";
		
		
		
        System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\136.0.7103.49 chromedriver-win64\\chromedriver-win64");
        WebDriver driver = new ChromeDriver();
//		 System.setProperty("webdriver.Edge.driver", "D:\\Selenium\\edgedriver_win64\\msedgedriver.exe");
//	        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String passwoord = getpassword(driver);
        
 //       private static final String Assert=null;
        //like same as firefox and chrome we have to write for the edge browser 
       driver.get("https://rahulshettyacademy.com/locatorspractice/");
  
//       // Create WebDriverWait object
//       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//       
//       WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inputUsername")));      
       driver.findElement(By.id("inputUsername")).sendKeys(name);
       
//       driver.findElement(By.id("inputPassword")).click();
       
       driver.findElement(By.name("inputPassword")).sendKeys(passwoord);
       driver.findElement(By.xpath("//input[@id='chkboxOne']")).click();
       driver.findElement(By.className("signInBtn")).click();
       Thread.sleep(5000);
       System.out.println(driver.findElement(By.tagName("p")).getText());
       Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
       Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
       driver.findElement(By.xpath("//*[text()='Log Out']")).click();
       driver.close();
       
	}
	
	public static String getpassword(WebDriver driver) throws InterruptedException
	{
		//like same as firefox and chrome we have to write for the edge browser 
	       driver.get("https://rahulshettyacademy.com/locatorspractice/");

	       driver.findElement(By.linkText("Forgot your password?")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//button[text()='Reset Login']")).click();
	      String getpwd = driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
	      String[]  passwordArry = getpwd.split("'");
	      
	      // the below code split the text into 2 times and then start execution 
//	      String[] passwordArry2 = passwordArry[1].split("'");
//	      passwordArry2[0];
	      
	      // this is an advance method to extract index array from array list and split the index value and take the 0th index value 
	      String password = passwordArry[1].split("'")[0];	
	      return password;
	}

}
