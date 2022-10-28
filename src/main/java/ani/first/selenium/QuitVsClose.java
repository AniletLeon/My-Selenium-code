package ani.first.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class QuitVsClose {

			public static void main(String[] args) {	

				//System.setProperty("webdriver.chrome.driver", "//Users/leon/Downloads/chromedriver");
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				driver.get("http://www.google.com");
				String tittle=driver.getTitle();
				System.out.println("page tittle:"+tittle);
				if(tittle.equals("Google")) {
					System.out.println("correct");
				}
				else {
					System.out.println("incorrect");
				}
					String url=driver.getCurrentUrl();
					System.out.println(url);
					driver.quit();
					
	}

}
