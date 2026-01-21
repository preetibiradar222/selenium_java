import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandling {

		// TODO Auto-generated method stub
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			 WebDriver driver = new ChromeDriver();
			 
			 driver.manage().window().maximize();
			 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
			driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
			driver.findElement(By.cssSelector("a[class='blinkingText']")).click();
			Set<String> window=driver.getWindowHandles();
			Iterator<String> w=window.iterator();
			String parent=w.next();
			String child=w.next();
			driver.switchTo().window(child);
			
	}

}
