package ajaxMouseInteraction;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assignment {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver",  "D:\\Selenium\\136.0.7103.49 chromedriver-win64\\chromedriver-win64");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()=\"Multiple Windows\"]")).click();
		
//		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
//		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=\"Click Here\"]")));
//		
		driver.findElement(By.xpath("//a[text()=\"Click Here\"]")).click();
		
		//windows handling after click 
	  Set<String>  windows = driver.getWindowHandles();
	  Iterator<String> it = windows.iterator();
	  String parentID = it.next();
	  String childID = it.next();
	  
	  driver.switchTo().window(childID);
	 System.out.println(driver.findElement(By.xpath("//div[@class=\"example\"]")).getText());
	  
	 driver.switchTo().window(parentID);
	 System.out.println(driver.findElement(By.xpath("//div[@class=\"example\"]")).getText());
	  
		
		

	}

}
