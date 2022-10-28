package ani.first.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {
	private WebDriver driver;

	public WebDriver InitBrowser(String browserName) {
		System.out.println("The browser name  is  :" + browserName);

		switch (browserName) {
		case "chrome":
			browserName.equalsIgnoreCase("chrome");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			browserName.equalsIgnoreCase("firefox");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "safari":
			browserName.equalsIgnoreCase("safari");

			driver = new SafariDriver();
			break;

		default:
			System.out.println("give the correct browser ......" + browserName);

		}
		return driver;
	}

	public void launchUrl(String Url) {

		if (Url == null) {
			System.out.println("Please enter the url");
			return;
		}
		if (Url.indexOf("http") == -1) {
			System.out.println("Please enter the http");
			return;
		}
		if (Url.indexOf("https") == -1) {
			System.out.println("Please enter the https");
			return;
		}

		driver.get(Url);

	}

	public void getPageSource() {
		if (driver.getPageSource().contains("Account Login")) {
			System.out.println("This is available in thr page source");

		} else {
			System.out.println("This is not available");
		}
	}

	public String getPageTitle() {
		String title = driver.getTitle();
		System.out.println("The page title is  :" + title);
		return title;
	}

	public String getCurrentUrl() {
		String CurrentUrl = driver.getTitle();
		System.out.println("The page title is  :" + CurrentUrl);
		return CurrentUrl;
	}

	public void browserquit() {
		driver.quit();
	}

	public void browserClose() {
		driver.close();
	}
}