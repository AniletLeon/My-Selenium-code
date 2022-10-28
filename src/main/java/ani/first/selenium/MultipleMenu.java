package ani.first.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleMenu {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		WebElement main = driver.findElement(By.cssSelector("a.meganav-shop"));
		Thread.sleep(4000);
		Actions act = new Actions(driver);
		act.moveToElement(main).perform();
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.cssSelector("ul#navBarMegaNav li"));
		for (WebElement e1 : list) {
			act.moveToElement(e1).perform();
			System.out.println(e1.getText());
			List<WebElement> list2 = driver
					.findElements(By.xpath("(//div[@class='col-md-3 pad-rt-0 desgn-fix'])[2]//li"));
			for (WebElement e2 : list2) {
				act.moveToElement(e2).perform();
				System.out.println(e2.getText());

			}
		}

	}
}
