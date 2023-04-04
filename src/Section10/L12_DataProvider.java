package Section10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class L12_DataProvider {

	WebDriver driver;
	@BeforeSuite
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Andela\\Desktop\\Resources\\driver_v1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(2000);
	}
	
	@DataProvider
	
	public Object[][] getData(){
		Object[][] data = new Object[3][2];
		
		data[0][0] = "bazina.andela@gmail.com";
		data[0][1] = "lidjfgls525";
		
		data[1][0] = "andelabazina96@gmail.com";
		data[1][1] = "p5dy9fWLqe2ZgW9";
		
		data[2][0] = "treer@test.com";
		data[2][1] = "342fhh";
		
		return data;
		
		
	}
	
	@Test(dataProvider = "getData")
	public void signin(String email, String password) throws InterruptedException{
		driver.get("http://teststore.automationtesting.co.uk/");
		driver.findElement(By.cssSelector("[title] .hidden-sm-down")).click();
		driver.findElement(By.cssSelector("section input[name='email']")).sendKeys(email);
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys(password);
		driver.findElement(By.id("submit-login")).click();
		System.out.println("user has logged in");
		driver.findElement(By.cssSelector(".hidden-sm-down.logout")).click();
		System.out.println("user has logged out");

	}
	
	
	@AfterSuite
	public void end() {
		driver.close();
		driver.quit();
	}
	
	

}
