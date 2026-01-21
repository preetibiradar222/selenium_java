import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouseover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://www.amazon.com/");
		
		driver.findElement(By.cssSelector(".a-button-text")).click();
		Actions a= new Actions(driver);
		WebElement move =(driver.findElement(By.id("nav-link-accountList-nav-line-1")));
		a.moveToElement(move).contextClick().perform();
		WebElement key=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		a.moveToElement(key).click().keyDown(Keys.SHIFT).sendKeys("Mobiles").doubleClick().build().perform();
		
		
	}

}
