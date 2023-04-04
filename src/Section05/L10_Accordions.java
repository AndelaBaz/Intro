package Section05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class L10_Accordions {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Andela\\\\Desktop\\\\Resources\\\\driver_v1\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.automationtesting.co.uk/accordion.html");
		
		for(int i=0; i<6; i++) {
			driver.findElement(By.cssSelector(".accordion > div:nth-of-type(1)")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector(".accordion > div:nth-of-type(3)")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector(".accordion > div:nth-of-type(5)")).click();
			}
		
		
		
		
		
	}

}
