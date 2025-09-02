package ajaxMouseInteraction;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.gecko.driver",  "D:\\Selenium\\136.0.7103.49 chromedriver-win64\\chromedriver-win64");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com/");
	Actions a = new Actions(driver);
	
	
	a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).build().perform();
	WebElement move = driver.findElement(By.cssSelector("div[id='nav-link-accountList']"));
	
	a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("mobile").doubleClick().build().perform();
	
	//moves to a specific element
	a.moveToElement(move).contextClick().build().perform();
	
	
//	driver.close();
	}

}
