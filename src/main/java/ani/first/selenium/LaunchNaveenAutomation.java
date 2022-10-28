package ani.first.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchNaveenAutomation {
	public static void main(String[] args) {	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http:\\www.naveenautomationlabs.com/opencartao");
		String tittle=driver.getTitle();
		System.out.println("tittle"+tittle);
		driver.close();
	}

}
