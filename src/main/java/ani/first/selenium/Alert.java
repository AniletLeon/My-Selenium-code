package ani.first.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(2000);
		org.openqa.selenium.Alert al=driver.switchTo().alert();
		String tes=al.getText();
		System.out.println(tes);
		al.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(2000);
		org.openqa.selenium.Alert al1=driver.switchTo().alert();
		String tes1=al.getText();
		System.out.println(tes1);
		al1.dismiss();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(2000);
		org.openqa.selenium.Alert al2=driver.switchTo().alert();
		String tes2=al.getText();
		System.out.println(tes2);
		al2.sendKeys("Suganya");
		al2.accept();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
