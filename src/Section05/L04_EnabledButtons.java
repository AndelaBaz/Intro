package Section05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L04_EnabledButtons {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Andela\\\\Desktop\\\\Resources\\\\driver_v1\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.automationtesting.co.uk/buttons.html");
		System.out.println(driver.findElement(By.cssSelector("button#btn_three")).isEnabled());
		System.out.println(driver.findElement(By.cssSelector("button#btn_four")).isEnabled());
	}

}
