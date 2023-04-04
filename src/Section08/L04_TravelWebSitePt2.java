package Section08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class L04_TravelWebSitePt2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Andela\\Desktop\\Resources\\driver_v1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.easyjet.com/en/");
		driver.findElement(By.id("ensCloseBanner")).click();
		
		driver.findElement(By.cssSelector("input[name='origin']")).click();
		driver.findElement(By.cssSelector("input[name='origin']")).sendKeys("London");
		
		List<WebElement> origins = new WebDriverWait(driver,20)
				.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#ui-id-1 li>a>span")));
				
		
		for(WebElement origin:origins) {
			//System.out.println(origin.getText());  --> ispis svih rezultata
			if(origin.getText().contains("Luton")) {
				origin.click();
			}
		}
		
		driver.findElement(By.cssSelector("input[name='destination']")).click();
		driver.findElement(By.cssSelector("input[name='destination']")).sendKeys("a");
		
		List<WebElement> destinations = new WebDriverWait(driver,20)
				.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#ui-id-2 li>a>span")));
				
		
		for(WebElement destination:destinations) {
			//System.out.println(origin.getText());  --> ispis svih rezultata
			if(destination.getText().contains("Antalya")) {
				destination.click();
			}
		}
		
		
		
	}

}
