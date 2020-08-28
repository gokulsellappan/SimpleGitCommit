package mavenproject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class loginCheck {
	
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setup() {
		
		//System.setProperty("webdriver.gecko.driver","D:\\gokul\\Testing\\selenium\\geckodriver-v0.27.0-win64\\geckodriver.exe");
		//driver= new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","D:\\sstudy\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	
	
	@Test
	public void doLogin() {
		
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("ggokull@gmail.com");;
		driver.findElement(By.id("pass")).sendKeys("gokul.s");
		driver.findElement(By.name("login")).click();
	}
	
	@AfterSuite
	public void teardown() {
		
		driver.quit();
		
	}

}
