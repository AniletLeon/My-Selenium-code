package ani.first.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkDisplays {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='footer-nav']//li"));
		System.out.println("total link"+list.size());
		for(WebElement e:list) {
			String text = e.getText();
			System.out.println(text);
			
			
			driver.get("https://www.bigbasket.com/pd/40272798/fresho-tender-coconut-premium-king-coconut-1-pcs/?nc=b-cp-hp-sec1&b_t=cp_hp_sec1&b_camp=hp_m_premium-tender-coconut_1600x460px-030922&t_from_ban=5260585&t_pos=3&t_ch=desktop");
			WebElement parents = driver.findElement(By.xpath("//span[text()='SHOP BY CATEGORY']"));
			WebElement level1 = driver.findElement(By.xpath("//a[text()='Beverages']"));
			WebElement level2 = driver.findElement(By.xpath("//a[text()='Tea Bags']"));
			WebElement level3 = driver.findElement(By.xpath("//a[text()='Tea Masala']"));

		}
		
		
		
	
	}

}
