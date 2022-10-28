package loginscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("admin");
		
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");

driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

String acttitle = driver.getTitle();
System.out.println(acttitle);

String url=driver.getCurrentUrl();
System.out.println(url);

if(acttitle.contains("Online Shopping Site for Mobiles,")) {
	System.out.println("Pass:home page is displayed");
	}
	else
	{
		
		System.out.println("Fail:home page is not displayed");
	}
driver.close();
	}
}
