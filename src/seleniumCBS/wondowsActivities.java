package seleniumCBS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class wondowsActivities {

	public static void main(String[] args) throws InterruptedException {
		String EmailID = "channaveerswamy.job@gmail.com";
		String Password = "@Cbswamy4456";

		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"D:\\Selenium\\136.0.7103.49 chromedriver-win64\\chromedriver-win64");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		// select dropdown static elements

		WebElement StaticDropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		// Select is the inbuild lib file from we can select dropdown options
		Select dropdown = new Select(StaticDropDown);

		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());

		dropdown.selectByContainsVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());

//	        Assert.assertEquals(false, null)

//	        driver.navigate().back();
//	        driver.navigate().forward();

	}

}
