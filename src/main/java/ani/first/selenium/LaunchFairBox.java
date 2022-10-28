package ani.first.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchFairBox {

	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver", "//Users/leon/Downloads/geckodriver");
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.close();
		}

}
