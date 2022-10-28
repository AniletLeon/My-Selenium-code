package ani.first.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDrown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
driver.get("https://www.bigbasket.com/");
WebElement parents = driver.findElement(By.xpath("//span[text()='SHOP BY CATEGORY']"));

Actions act=new Actions(driver);
act.moveToElement(parents).perform();
Thread.sleep(1000);


	}

}
