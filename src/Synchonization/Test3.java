package Synchonization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	
		
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.udemy.com/join/login-popup/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
			
	//driver.findElement(By.xpath("//span[text()='Log in']")).click();
	
	driver.findElement(By.name("email")).sendKeys("hggffdj");
	driver.findElement(By.id("id_password")).sendKeys("jhhgffee");
	driver.findElement(By.id("submit-id-submit")).click();

	String actualtitle=driver.getTitle();
	System.out.println(actualtitle);
	String url=driver.getCurrentUrl();
	System.out.println(url);

	if(actualtitle.contains("Login | Udemy")) {
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
	//driver.close();
		}

	}


