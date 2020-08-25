package mavenproject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class loginCheck {
	
	
	public static WebDriver driver;
	
	@Test
	public void doLogin() {
		
		driver = new ChromeDriver(); 
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("ggokull@gmail.com");;
		driver.findElement(By.id("pass")).sendKeys("gokul.s");
	}
	
	@AfterSuite
	public void teardown() {
		
		driver.quit();
		
	}

}
