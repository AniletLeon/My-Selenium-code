package ani.first.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchOpenCart {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
String url=driver.getCurrentUrl();
if(url.contains("account/login")) {
	System.out.println("true");
}
	else {
		System.out.println("false");
	}

String title=driver.getTitle();
if(title.equals("Account Login")) {
	System.out.println("true");
	}
		else {
			System.out.println("false");
		}
driver.close();

}
	
}

	


