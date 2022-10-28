package ani.first.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SuggestionList {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		By links = By.id("search_query_top");
		doSendKeys(links, "dress");
		Thread.sleep(5000);
		By sugg = By.xpath("//div[@class='ac_results']//li");

		performSuggestionList(sugg, "CasualF");
		String productName="T-shirts > Faded Short Sleeve T-shirts";
		selectItem(productName);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSendKeys(By locator, String searchkey) {
		getElement(locator).sendKeys(searchkey);
	}

	public static void performSuggestionList(By locator, String searchclick) {
		List<WebElement> elements = driver.findElements(locator);
		System.out.println("the sise of list:" + elements.size());
		for (WebElement e : elements) {
			String compList = e.getText();
			System.out.println(compList);
			if (compList.contains(searchclick)) {
				e.click();
				break;
			}
		}
	}

	public static void selectItem(String productName) {
		driver.findElement(By.xpath("//li[text()='"+productName+"']")).click();
	
	}
}