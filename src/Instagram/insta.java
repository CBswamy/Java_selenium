package Instagram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class insta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\136.0.7103.49 chromedriver-win64\\chromedriver-win64");
		
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		   driver.get("https://www.instagram.com/");
           driver.findElement(By.xpath("//input[@name='username']")).sendKeys("channaveerswamy64@gmail.com");
           driver.findElement(By.xpath("//input[@aria-label=\"Password\"]")).sendKeys("@Cbswamy9591200465");
           driver.findElement(By.xpath("//*[text()=\"Log in\"]")).click();
           driver.findElement(By.xpath("//div[text()=\"Not now\"]")).click();
         //div[text()="Not now"]
           
	}

}
