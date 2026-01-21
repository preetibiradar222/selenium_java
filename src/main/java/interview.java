import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class interview {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		 driver.get("https://rahulshettyacademy.com/locatorspractice/");
		 driver.findElement(By.id("inputUsername")).sendKeys("User123");
		 driver.findElement(By.name("inputPassword")).sendKeys("1234");
		 
		// System.out.println(driver.findElement(By.xpath("//h1[text()='Rahul Shetty Academy']")).getText());
		 WebElement header = driver.findElement(By.cssSelector("div[class='login-container'] h1"));
	        System.out.println("Heading text: " + header.getText());
	       
	        System.out.println("Rahul Shetty Academy");
		 Thread.sleep(2000);
		 
		 driver.navigate().to("https://www.amazon.com/");
		 driver.navigate().back();
		 driver.navigate().forward();
	
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	
		 
		driver.quit();



	}

}
