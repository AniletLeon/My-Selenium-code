package ani.first.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
private static WebDriver driver;
	public static void main(String[] args) {

			BrowserUtil brUtil=new BrowserUtil();
			WebDriver driver=brUtil.InitBrowser("chrome");
			brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
			ElementUtil eleUtil=new ElementUtil(driver);
			By fistName=By.id("input-firstname");
			By lastName=By.id("input-lastname");
			By email=By.id("input-email");
			By phoneNumber=By.id("input-telephone");
			By passwors=By.id("input-password");
			By conformpassword=By.id("input-confirm");
		
			System.out.println(eleUtil.doGetTextAtribute(fistName,"placeholder"));
			System.out.println(eleUtil.doGetTextAtribute(lastName,"placeholder"));
			System.out.println(eleUtil.doGetTextAtribute(email,"placeholder"));
			System.out.println(eleUtil.doGetTextAtribute(phoneNumber,"placeholder"));
			System.out.println(eleUtil.doGetTextAtribute(passwors,"placeholder"));
			System.out.println(eleUtil.doGetTextAtribute(conformpassword,"placeholder"));
			
			System.out.println(eleUtil.doElementGetText(fistName));
			System.out.println(eleUtil.doElementGetText(lastName));
			System.out.println(eleUtil.doElementGetText(email));
			System.out.println(eleUtil.doElementGetText(phoneNumber));
			System.out.println(eleUtil.doElementGetText(passwors));
			System.out.println(eleUtil.doElementGetText(conformpassword));
		eleUtil.doSendKeys(fistName,"Anilet");
		eleUtil.doSendKeys(lastName, "leon");
		eleUtil.doSendKeys(passwors, "Anson@123");
		eleUtil.doSendKeys(email, "anilet1987@gmail.com");
		eleUtil.doSendKeys(conformpassword, "Anson@123");
		eleUtil.doSendKeys(phoneNumber, "4354354553");
		System.out.println("Browser was launched");
		
	
		
		
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

