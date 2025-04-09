package mpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo4 {
@Test
	public static void main()throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://omayo.blogspot.com/");
		WebElement dropdown = driver.findElement(By.id("drop1"));
	
		
		Select select=new Select(dropdown);
		Thread.sleep(3000);
		select.selectByIndex(1);
		Thread.sleep(3000);

		driver.close();
	}
	
	

}
