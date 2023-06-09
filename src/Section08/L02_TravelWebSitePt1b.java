package Section08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class L02_TravelWebSitePt1b {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Andela\\Desktop\\Resources\\driver_v1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.easyjet.com/en/");
		driver.findElement(By.id("ensCloseBanner")).click();
		
		driver.findElement(By.cssSelector("input[name='origin']")).click();
		driver.findElement(By.cssSelector("input[name='origin']")).sendKeys("London");
		
		List<WebElement> origins = driver.findElements(By.cssSelector("#ui-id-1 li>a>span"));
		for(WebElement origin:origins) {
			System.out.println(origin.getText());
		}
		
	}

}
