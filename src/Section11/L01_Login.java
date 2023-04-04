package Section11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class L01_Login {

	WebDriver driver;
	@BeforeSuite
	public void setup() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Andela\\Desktop\\Resources\\driver_v1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Properties prop = new Properties();
		FileInputStream data = new FileInputStream("C:\\Users\\Andela\\Desktop\\Resources\\workspaces\\Intro\\src\\Section11\\L01_config.properties");
		prop.load(data);
		driver.get("url");
		Thread.sleep(2000);
	}
	
	@Test
	public void signin() throws InterruptedException{
		driver.findElement(By.cssSelector("[title] .hidden-sm-down")).click();
		driver.findElement(By.cssSelector("section input[name='email']")).sendKeys("andelabazina96@gmail.com");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("p5dy9fWLqe2ZgW9");
		driver.findElement(By.id("submit-login")).click();
		System.out.println("user has logged in");
		Thread.sleep(2000);

	}
	
	
	

}
