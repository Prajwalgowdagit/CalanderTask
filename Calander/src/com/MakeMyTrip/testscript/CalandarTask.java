package com.MakeMyTrip.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

import com.MakeMyTrip.generic.BaseClass;

import java.io.File;
import java.time.Duration;

public class CalandarTask extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.get("https://www.makemytrip.com");
				Thread.sleep(2000);
				driver.findElement(By.className("commonModal__close")).click();
		driver.findElement(By.xpath("//span[text() ='Departure']")).click();
		Thread.sleep(2000);
		String yesterday = driver.findElement(By.xpath("(//div[@aria-selected='true']/..//div[@aria-disabled='true'])[last()]")).getAttribute("aria-label");
		System.out.println("yesterday = "+yesterday);
		String today = driver.findElement(By.xpath("(//div[@aria-selected='true']/..//div[@aria-disabled='false'])[1]")).getAttribute("aria-label");
		System.out.println("today = "+ today);
		String tomorrow = driver.findElement(By.xpath("//div[@aria-selected='true']")).getAttribute("aria-label");
		System.out.println("tomorrow = "+ tomorrow);
		driver.quit();
     }
}




	
	

