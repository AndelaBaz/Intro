package Section05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;



public class L09_Popups {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Andela\\\\Desktop\\\\Resources\\\\driver_v1\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.automationtesting.co.uk/popups.html");
		driver.findElement(By.cssSelector("[onclick='popup\\(\\)']")).click();
		
		String MainWindow = driver.getWindowHandle();
		Set <String> handles = driver.getWindowHandles();
		Iterator <String> iterate = handles.iterator();
		
		while (iterate.hasNext()) {
			String child = iterate.next();
			
			if(!MainWindow.equalsIgnoreCase(child)) {
				Thread.sleep(3000);
				driver.switchTo().window(child);
				driver.close();
			}
		}
		Thread.sleep(3000);
		driver.switchTo().window(MainWindow);
		
		
		
	}

}
