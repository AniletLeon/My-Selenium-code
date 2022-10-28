package ani.first.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTest {

	public static void main(String[] args) {
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.InitBrowser("chrome");
		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		String mail = "input-email";
		By loginButn = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");

		ElementUtil eleUtil = new ElementUtil(driver);
		By pasword = By.id("input-password");
		eleUtil.doSendKeys(mail, "anilet1987@gmail.com", "id");
		eleUtil.doSendKeys(pasword, "Anson@123");
		eleUtil.doClick(loginButn);
		brUtil.browserClose();
	}

}
