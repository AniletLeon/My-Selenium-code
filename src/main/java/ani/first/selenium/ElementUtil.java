package ani.first.selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {

	private WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public By getBy(String selector, String locatortype) {
		By locator = null;
		switch (locatortype.toLowerCase()) {
		case "id":
			locator = By.id(selector);
			break;
		case "name":
			locator = By.name(selector);
			break;
		case "class":
			locator = By.className(selector);
			break;
		case "xpath":
			locator = By.xpath(selector);
			break;
		case "cssselector":
			locator = By.cssSelector(selector);
			break;
		case "linktext":
			locator = By.linkText(selector);
			break;
		case "partiallinktext":
			locator = By.partialLinkText(selector);
			break;
		case "tagname":
			locator = By.tagName(selector);
			break;
		default:
			break;

		}
		return locator;
	}

	public void doSendKeys(String selector, String value, String locatortype) {
		By locator = getBy(selector, locatortype);
		getElement(locator).sendKeys(value);
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	public void doClick(String locatortype, String selector) {
		By locator = getBy(selector, locatortype);
		getElement(locator).click();
	}

	public String doElementGetText(By locator) {
		String eleText = getElement(locator).getText();

		return eleText;
	}

	public String doGetTextAtribute(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);

	}

	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);

	}

	public int getPageElementscount(By locator) {
		return getElements(locator).size();
	}

	public List<String> getElementsTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleTextList = new ArrayList<String>();
		for (WebElement e : eleList) {
			String Text = e.getText();
			if (!Text.isEmpty()) {
				eleTextList.add(Text);

			}
		}
		return eleTextList;
	}

	public int getElementsTextCount(By locator) {
		return getElementsTextList(locator).size();
	}

	public int getEmptyTextCount(By locator) {
		return (getPageElementscount(locator) - getElementsTextCount(locator));
	}

	public List<String> getElementsAttributeList(By locator, String attName) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleAttrvalList = new ArrayList<String>();
		for (WebElement e : eleList) {
			String attrVal = e.getAttribute(attName);

			eleAttrvalList.add(attrVal);

		}

		return eleAttrvalList;
	}

	public void performSuggestionList(By locator, String searchclick) {
		List<WebElement> elements = getElements(locator);
		System.out.println("the sise of list:" + elements.size());
		for (WebElement e : elements) {
			String compList = e.getText();
			System.out.println(compList);
			if (compList.contains(searchclick)) {
				e.click();
				break;
			}
		}
	}

	public void selectItem(String productName) {
		By locator = By.xpath("//li[text()='" + productName + "']");
		doClick(locator);

	}

	// ======================webElement count=============
	public int getElementCount(By locator) {
		int eleCount = getElements(locator).size();
		System.out.println("the element count:   " + eleCount);
		return eleCount;
	}

	public boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

	public boolean checksingleElementExit(By locator) {
		if (getElementCount(locator) == 1) {
			return true;
		}
		return false;
	}

	public boolean checkMultipleElementExit(By locator) {
		if (getElementCount(locator) > 1) {
			return true;
		}
		return false;
	}

}
