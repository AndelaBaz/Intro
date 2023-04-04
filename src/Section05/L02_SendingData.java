package Section05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L02_SendingData {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Andela\\\\Desktop\\\\Resources\\\\driver_v1\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.automationtesting.co.uk/contactForm.html");
		driver.findElement(By.cssSelector("form#contact_form > input[name='first_name']")).sendKeys("Andela");
		driver.findElement(By.cssSelector("form#contact_form > input[name='last_name']")).sendKeys("Bazina");
		driver.findElement(By.cssSelector("form#contact_form > input[name='email']")).sendKeys("bazina.andela@gmail.com");
		driver.findElement(By.cssSelector("form#contact_form > textarea[name='message']")).sendKeys("Ovo je komentar.");
	}

}
