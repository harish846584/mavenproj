package mpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.xpath("//a[@title='My Account']")).click();
		
		driver.findElement(By.linkText("Login")).click();
		//login to the page with valid credentials
		driver.findElement(By.id("input-email")).sendKeys("harish999@gmail.com");		
		driver.findElement(By.id("input-password")).sendKeys("12345");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//confirmation for loggined or not
		boolean account=driver.findElement(By.xpath("//body/div[@id='account-account']/ul[1]/li[2]/a[1]")).isDisplayed();
		
		if(account==true) {
			System.out.println("login was succesful");
		}
		else {
			System.out.println("not login");
		}
		
		
		//driver.close();
	}
	
}
