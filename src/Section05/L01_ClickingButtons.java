package Section05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L01_ClickingButtons {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Andela\\\\Desktop\\\\Resources\\\\driver_v1\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.automationtesting.co.uk/buttons.html");
		driver.findElement(By.cssSelector("button#btn_one")).click();
	}

}
