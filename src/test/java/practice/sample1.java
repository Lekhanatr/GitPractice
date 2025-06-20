package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1 {
	public static void main(String[] args) {
		System.out.println("Github");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/login");
		driver.findElement(By.id("userName")).sendKeys("Lekhana");
		driver.findElement(By.id("password")).sendKeys("abc*123");
		driver.findElement(By.id("login")).click();
		
		//creating new user
		driver.findElement(By.id("newUser")).click();
		driver.findElement(By.className("mr-sm-2 form-control")).sendKeys("abc");
		driver.findElement(By.id("lastname")).sendKeys("xyz");
		
		
		
	}

}
