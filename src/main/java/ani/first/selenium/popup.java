package ani.first.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class popup {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Accept All']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		

	}

}
