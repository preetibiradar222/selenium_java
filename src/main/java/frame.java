import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frame {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
       driver.get("https://jqueryui.com/droppable/");
       driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
       Actions a=new Actions(driver);
       WebElement wb=driver.findElement(By.id("draggable"));
       
       WebElement wb1=driver.findElement(By.id("droppable"));
       
      
       a.dragAndDrop(wb, wb1).build().perform();
       driver.switchTo().defaultContent();
       File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       FileUtils.copyFile(src, new File("Downloads.screenshot.png"));
       
       
	}

}
