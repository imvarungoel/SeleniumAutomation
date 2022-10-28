package Synchonization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test4 {

	
		public static void main(String[] args) throws InterruptedException {
			
			 
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.instagram.com/");
			
			WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
			
			
WebElement user=driver.findElement(By.name("username"));
	w.until(ExpectedConditions.visibilityOf(user)).sendKeys("qwertgh");	

	driver.findElement(By.name("password")).sendKeys("hgfdsdg");
			
			
WebElement button=driver.findElement(By.xpath("(//div[contains(@class, 'qF0y9') ] )[4] "));
w.until(ExpectedConditions.elementToBeClickable(button)).click();

	String title= driver.getTitle();
	w.until(ExpectedConditions.titleContains("instagram"));
	
	Thread.sleep(3000);
	driver.close();
		}

	}
	

	
