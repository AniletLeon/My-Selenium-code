package register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Register {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Suganya");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("NM");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("suganyagandhi@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("7123456789");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Anilet123");
		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("Anilet123");
		driver.findElement(By.xpath("(//input[@name='newsletter'])[1]")).click();
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		

	}

}
