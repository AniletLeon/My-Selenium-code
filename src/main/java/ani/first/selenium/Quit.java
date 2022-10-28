package ani.first.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quit {

	public static void main(String[] args) {

			System.setProperty("webdriver.chrome.driver", "//Users/leon/Downloads/chromedriver");
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.google.com");
			String tittle=driver.getTitle();
			System.out.println("page tittle:"+tittle);
			
				String url=driver.getCurrentUrl();
				System.out.println(url);
				driver.quit();
				System.out.println(driver.getTitle());
				}

}
