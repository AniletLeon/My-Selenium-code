package ani.first.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageGination {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(4000);
		while(true) {
		
			 if(driver.findElements(By.xpath("//td[text()=\"United States\"]")).size() > 0) {
				 selectMulticountry("United States");
				 
			 WebElement text =driver.findElement(By.linkText("Next")); 
			 if(text.getAttribute("class").contains("disables")) {
					 System.out.println("enter the correct county"); } text.click();
					 Thread.sleep(1000); }
				 
			 }
				 
		}
		
		
		
		
		
		
		
		/*
		 * while (true) { if
		 * (driver.findElements(By.xpath("//td[text()=\"United States\"]")).size() > 0)
		 * { selectcountry("United States"); break; } else { WebElement text =
		 * driver.findElement(By.linkText("Next")); if
		 * (text.getAttribute("class").contains("disables")) {
		 * System.out.println("enter the correct county"); } text.click();
		 * Thread.sleep(1000); }
		 * 
		 * }
		 */
	

	public static void selectcountry(String count) {
		driver.findElement(By.xpath("//td[text()=\"" + count + "\"]/preceding-sibling::td/input[@type='checkbox']"))
				.click();
	}

	public static void selectMulticountry(String count) {
		List<WebElement> list = driver.findElements(
				By.xpath("(//td[text()=\"" + count + "\"])/preceding-sibling::td/input[@type='checkbox']"));
		for (WebElement e : list) {
			e.click();
		}
	}
}
