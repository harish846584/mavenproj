package mpack;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo3 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("data.properties");
		prop.load(fis);
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(prop.getProperty("URL"));
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("password"));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		driver.close();
		System.out.println("page got successfully launched");
	}

}
