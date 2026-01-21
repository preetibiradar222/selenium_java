import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;

public class inte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		 driver.get("http://rahulshettyacademy.com/dropdownsPractise/");
		 WebElement staticfl =driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
		 Select o=new Select(staticfl);
		 o.selectByIndex(3);
	System.out.println(o.getFirstSelectedOption().getText());
	o.selectByVisibleText("AED");
	System.out.println(o.getFirstSelectedOption().getText());
	o.selectByValue("INR");
	System.out.println(o.getFirstSelectedOption().getText());
	//System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
	
	driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
	//System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
	Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
	
	System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isEnabled());
	Assert.assertEquals((driver.findElements(By.cssSelector("input[type='checkbox']")).size())
	, 6);
	
	}

}
