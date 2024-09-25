package CalanadarTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;

public class CalandarTask {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.makemytrip.com");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(2000);
		driver.findElement(By.className("commonModal__close")).click();
		driver.findElement(By.xpath("//span[text() ='Departure']")).click();
		Thread.sleep(2000);
		String yesterday = driver.findElement(By.xpath("(//div[@aria-selected='true']/..//div[@aria-disabled='false'])[1]")).getAttribute("aria-label");
		System.out.println("Yesterday = "+ yesterday);
		String today = driver.findElement(By.xpath("//div[@aria-selected='true']")).getAttribute("aria-label");
		System.out.println("Today = "+ today);
		String tomorrow = driver.findElement(By.xpath("(//div[@aria-selected='true']/..//div[@aria-disabled='false'])[3]")).getAttribute("aria-label");
		System.out.println("Tomorrow = "+tomorrow);
		driver.quit();
     }
}




	
	

