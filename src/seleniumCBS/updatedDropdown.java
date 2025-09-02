package seleniumCBS;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

/*TestNG is on of the automation framework
 * Assert.assertfalse() fails if the giver assertion doesn't match with the expected output.
 * Assert.asserttrue()
 * Assert.assertEqual(current, expected)
 * 
 */


public class updatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\136.0.7103.49 chromedriver-win64\\chromedriver-win64");
	
   WebDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
   driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
   
//   System.out.println(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_IndArm']")).isSelected());
   Assert.assertFalse(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_IndArm']")).isSelected());
   driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_IndArm']")).click();
//   System.out.println("checkbox selected= " + driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_IndArm']")).isSelected());
   
   Assert.assertTrue(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_IndArm']")).isSelected());
   
   //count the number of check boxes
   System.out.println(driver.findElement(By.cssSelector("input[type='checkbox']")).getSize());
   
   
   driver.findElement(By.id("divpaxinfo")).click();
//   Thread.sleep(2000);
   
   /*while loop example
   int i = 0;
   while(i<=6)
   {
   driver.findElement(By.id("hrefIncAdt")).click();
     i++;
   }
   */
   System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
   // for loop example
   for(int i=1; i<4; i++) {
   driver.findElement(By.id("hrefIncAdt")).click();
   }
   
   System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
   // using dynamic xpath finder
   driver.findElement(By.xpath("//input[starts-with(@value, 'Don')]")).click();
    

   
   driver.close();
   
	}

}
