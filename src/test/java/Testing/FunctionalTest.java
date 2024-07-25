package Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.assignment.GENCautomation.PageObject;

public class FunctionalTest extends PageObject {
	public FunctionalTest(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	WebDriver driver;
	@Test
	public  void Google() {
		
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yamin\\GENCautomation\\drivers\\chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.get("https://phptravels.net/login");
		driver.manage().window().maximize();

}

	
	@AfterSuite
	public void quitDriver() {
		driver.quit();
	}
}
