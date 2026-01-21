
import java.time.Duration;
import java.util.Set;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;

public class llist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		 driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		 driver.findElement(By.xpath("//tr/th[1]")).click();
		 
		 List<WebElement> l= driver.findElements(By.xpath("//tr/td[1]"));
 
	List<String> l1= l.stream().map(s->s.getText()).sorted().collect(Collectors.toList());
	System.out.println(l1);
	}
}

		 