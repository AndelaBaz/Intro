package Section10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class L13_DependnsOnMethod {

	WebDriver driver;
	@BeforeSuite
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Andela\\Desktop\\Resources\\driver_v1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.get("http://teststore.automationtesting.co.uk/login?back=my-account");
	}
	
	@Test
	public void enterEmail() {
		driver.findElement(By.cssSelector("section input[name='email']")).sendKeys("andelabazina96@gmail.com");
	}
	
	@Test
	public void enterPass() {
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("p5dy9fWLqe2ZgW9");
	}
	
	@Test(dependsOnMethods= {"enterPass"})
	public void enterBtn() {
		driver.findElement(By.cssSelector("button#submit-login")).click();
	}
	

}
