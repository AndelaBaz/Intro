 package Section08;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class L06_Tabs {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Andela\\Desktop\\Resources\\driver_v1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.automationtesting.co.uk/browserTabs.html");
		//kliknemo na botun da se otvore 3 taba
		for(int i=0; i<3; i++) {
			driver.findElement(By.cssSelector("[type]")).click();
		}
		
		//ID svakog taba spremamo u arraylist
		ArrayList <String> windowsHandles = new ArrayList<String>(driver.getWindowHandles());
		
		System.out.println("Imamo " + windowsHandles.size() + "otvorena taba");
		
		for(String item:windowsHandles) {
			Thread.sleep(2000);
			driver.switchTo().window(item);
		}
		Thread.sleep(2000);
		driver.switchTo().window(windowsHandles.get(0));
		
		
	}

}
