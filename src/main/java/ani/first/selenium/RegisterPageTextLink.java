package ani.first.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterPageTextLink {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='list-group']/a"));
		System.out.println("The size" + list.size());
		for (WebElement e : list) {
			String text = e.getText();
			System.out.println(text);
		}
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static int getElementCount(By locator) {
		int eleCount = getElements(locator).size();
		System.out.println("the element count:   " + eleCount);
		return eleCount;
	}

	public static boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

	public static boolean checksingleElementExit(By locator) {
		if (getElementCount(locator) == 1) {
			return true;
		}
		return false;
	}
	public static boolean checkMultipleElementExit(By locator) {
		if (getElementCount(locator) >1) {
			return true;
		}
		return false;
	}
}
