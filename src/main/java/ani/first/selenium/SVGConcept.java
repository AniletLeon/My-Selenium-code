package ani.first.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SVGConcept {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://petdiseasealerts.org/forecast-map/#/");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[local-name()='svg' and@id='map-svg']//*[name()='g' and @id='california']/*[name()='path']"))
	.click();
	

	}

}
