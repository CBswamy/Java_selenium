package seleniumCBS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\136.0.7103.49 chromedriver-win64\\chromedriver-win64");
		
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		   driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		   
		   driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]")).click();
		   System.out.println(driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]")).isSelected());
		   
		   driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]")).click();
		   System.out.println(driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]")).isSelected());

	}

}
