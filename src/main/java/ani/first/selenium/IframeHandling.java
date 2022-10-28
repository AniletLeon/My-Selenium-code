package ani.first.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeHandling {

	public static void main(String[] args) throws InterruptedException {
		
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
driver.findElement(By.cssSelector("div#imageTemplateContainer img")).click();
Thread.sleep(2000);
driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
driver.findElement(By.xpath("//input[@id='RESULT_TextField-7']")).sendKeys("647785784");
driver.findElement(By.xpath("(//label[@class='question top_question'])[1]/following-sibling::input"))
.sendKeys("2000");
driver.findElement(By.xpath("(//label[@class='question top_question'])[2]/following-sibling::input"))
.sendKeys("Ford");
driver.findElement(By.xpath("(//label[@class='question top_question'])[3]/following-sibling::input"))
.sendKeys("Highlander");
driver.findElement(By.xpath("(//label[@class='question top_question'])[4]/following-sibling::input"))
.sendKeys("White");
driver.findElement(By.xpath("(//label[@class='question top_question'])[5]/following-sibling::input"))
.sendKeys("100000");
driver.findElement(By.xpath("(//label[@class='question top_question'])[7]/following-sibling::input"))
.sendKeys("Anilet");
driver.findElement(By.xpath("(//label[@class='question top_question'])[8]/following-sibling::input"))
.sendKeys("1035");

driver.findElement(By.xpath("(//label[@class='question top_question'])[9]/following-sibling::input"))
.sendKeys("Sunnyvale");
Select select=new Select(driver.findElement(By
		.xpath("(//label[@class='question top_question'])[10]/following-sibling::select")));
select.selectByVisibleText("California");

	}

}
