package ani.first.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllNavigation {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.html");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Anilet");		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("ani@123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='mainpanel']")));
	
		Actions act=new Actions(driver);
		WebElement parent=driver.findElement(By.xpath("(//ul[@class='mlddm']//li)[11]/a"));
		act.moveToElement(parent).perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//ul[@class='mlddm']//li)[11]//li/a[@title='New Contact']")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("first_name")).sendKeys("Anlet");
		driver.findElement(By.id("surname")).sendKeys("Leo");
		
		
	}

}