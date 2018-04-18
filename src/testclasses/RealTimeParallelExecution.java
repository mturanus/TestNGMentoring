package testclasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RealTimeParallelExecution {
	
	WebDriver driver;
	String baseURL;
	
	
	@BeforeClass
	@Parameters({"browser"})
	public void setUp(String browser) {
		baseURL = "http://34.223.219.142:1022/zurmo/app/index.php/zurmo/default/login";
		
		
		if (browser.equalsIgnoreCase("firefox")) {
			//set the property for firefox
			//initialize the driver with firefox driver 
		} else if (browser.equalsIgnoreCase("chrome")) {
			//set the property for firefox
			//initialize the driver with firefox driver 
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);
	}
	
	@Test
	public void testLogin() throws InterruptedException {
		
		WebElement userName = driver.findElement(By.id("LoginForm_username"));
		userName.sendKeys("admin");
		WebElement passwordField = driver.findElement(By.id("LoginForm_password"));
		passwordField.sendKeys("abc123");
		WebElement loginButton = driver.findElement(By.xpath("//span[@class='z-label']"));
		loginButton.click();
	}
	
	
	//Create the xml file and set up two different test and give the parameter with value that are firefox and chrome 
	
	@AfterClass
	public void cleanUp() {
		driver.quit();
	}
}
