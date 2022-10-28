package ani.first.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsMethod {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.com/");
By links=By.tagName("a");
	
ElementUtil elutil=new ElementUtil(driver);
List<WebElement> weblinks=elutil.getElements(links);
	
System.out.println("Total link count   :"+weblinks.size());
System.out.println(elutil.getElementsTextList(links));

System.out.println("Emprt count  :"+elutil.getEmptyTextCount(links));
System.out.println("attribute val :"+elutil.getElementsAttributeList(links, "href"));

	}

}
