package seleniumCBS;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class GreenKart {

	private static final String[] itemsNeededList = null;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"D:\\Selenium\\136.0.7103.49 chromedriver-win64\\chromedriver-win64");
		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		addItems(driver, itemsNeededList);
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//div[@class=\"cart-preview active\"]//ul[@class='cart-items']")).click();
		driver.findElement(By.xpath("//button[text()=\"PROCEED TO CHECKOUT\"]")).click();
		
		//button[text()="PROCEED TO CHECKOUT"]
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		
		//explicit wait 
		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
		String actualText = driver.findElement(By.cssSelector(".promoInfo")).getText();
		
		
		if(actualText=="Code applied ..!") {
		Assert.assertEquals(actualText, "Code applied ..!");
//		boolean CBS = driver.findElement(By.cssSelector(".promoInfo")).getText() != null;
//		Assert.assertTrue(CBS, "Code applied ..!");
		}
		else {
			System.out.println("Invalid code....!");
			
		}
		driver.close();
		
	}
	
	
	
	
	

	public static void addItems(WebDriver driver, String[] args) {
		// List of items to add to cart
		String[] itemnames = { "Cucumber", "Cauliflower", "Beetroot", "Beans" };
		List<String> itemsNeededList = Arrays.asList(itemnames);

		int j = 0;

		// Get all products on the page
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {
			// Extract product name (remove extra characters/quantity info)
			String name = products.get(i).getText().split("-")[0].trim();

			// If this product is one you want to add, click its "ADD TO CART"
			if (itemsNeededList.contains(name)) {
				j++;
				// Find and click the button in the same row as the matching product
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == itemnames.length)

				{

					break;

				}

			}
		}
	}
}
