package seleniumCBS;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\136.0.7103.49 chromedriver-win64\\chromedriver-win64");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://www.ixigo.com/flights?utm_source=bing&utm_medium=paid_search_bing&utm_campaign=AC_Mar_Sc&msclkid=20a7bbe17bc112f4a445d379ab6997fc&utm_term=spicejet%20ticket&utm_content=Spicejet");
        
        
        driver.findElement(By.xpath("(//div[@class='flex-1 h-full flex flex-col justify-center px-15 py-10 '])[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@class='outline-none w-full bg-transparent placeholder:text-disabled pt-3 text-primary placeholder:opacity-0 focus:placeholder:opacity-100 font-medium text-lg !pt-5']")).sendKeys("DEL");
        Thread.sleep(4000);
        
        List<WebElement> options = driver.findElements(By.xpath("//span[@class=\"text-primary text-sm\"]"));

        
        for(WebElement option : options)
 	   {
 		   if(option.getText().contains("DEL"))
 		   {
 			  
 			   option.click();
 			   break;
 		   }
//        sendKeys("MAH");
		

	}
	}
}

