package Section09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class L03_Cookies {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Andela\\Desktop\\Resources\\driver_v1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://teststore.automationtesting.co.uk/");
		
		driver.findElement(By.cssSelector("[title] .hidden-sm-down")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("section input[name='email']")).sendKeys("andelabazina96@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("p5dy9fWLqe2ZgW9");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button#submit-login")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("CLOTHES")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("img[alt='Hummingbird printed t-shirt']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".add-to-cart.btn.btn-primary")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".btn.btn-secondary")).click();
		Thread.sleep(1000);
		
		driver.manage().deleteAllCookies();
		
	}

}
