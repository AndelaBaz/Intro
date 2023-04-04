package Section11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class L02_Login {

	WebDriver driver;
	@BeforeSuite
	public void setup() throws InterruptedException, IOException {
		
		Properties prop = new Properties();
		FileInputStream data = new FileInputStream("C:\\Users\\Andela\\Desktop\\Resources\\workspaces\\Intro\\src\\Section11\\L01_config.properties");
		prop.load(data);
		
		
		if(prop.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Andela\\Desktop\\Resources\\driver_v1\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (prop.getProperty("browser").equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Andela\\Desktop\\Resources\\driver_v1\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Andela\\Desktop\\Resources\\driver_v1\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
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
