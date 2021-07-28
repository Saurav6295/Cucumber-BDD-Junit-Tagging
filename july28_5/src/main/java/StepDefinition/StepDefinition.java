package StepDefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	WebDriver driver;
	
	@Given("^User is already on login page$")
	public void user_is_already_on_login_page() throws Throwable {
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:/Program Files/Google/Chrome/Application/chrome/chrome.exe");

		// driver object has been assigned the value of URL 
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Google\\Chrome\\Application\\chrome driver\\chromedriver.exe");
		
		driver = new ChromeDriver(options);
		// driver looks for chrome through options object

		driver.get("https://www.flipkart.com/");
		// chrome driver instance
		
		 //driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.quit();
	    
	}

	@Given("^title of the page is Flipkart$")
	public void title_of_the_page_is_Flipkart() throws Throwable {
		
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:/Program Files/Google/Chrome/Application/chrome/chrome.exe");

		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Google\\Chrome\\Application\\chrome driver\\chromedriver.exe");
		// ooper waaale line me driver object ko assigned hua chrome driver ka path
		driver = new ChromeDriver(options);
		// driver looks for chrome through options object

		driver.get("https://www.flipkart.com/");
		// chrome driver instance
		
		 //driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!",title);
		driver.quit();
	}

	

}
