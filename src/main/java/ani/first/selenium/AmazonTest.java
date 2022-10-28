package ani.first.selenium;

public class AmazonTest {

	public static void main(String[] args) {
		BrowserUtil brUtil=new BrowserUtil();
		brUtil.initDriver("chrome");
		brUtil.launchUrl("https://www.Amazon.com");
		brUtil.isUrlFractionExist("amazon");
		if (brUtil.isUrlFractionExist("amazon")) {
			System.out.println("url is correct with amazon....PASS");
		} else {
			System.out.println("FAIL");
		}

		if (brUtil.isInfoExistInPageSource("https://completion.amazon.com")) {
			System.out.println("page source is correct with fraction url....PASS");
		} else {
			System.out.println("FAIL");
		}

		if (brUtil.getPageTitle().contains("Amazon.com. Spend less. Smile more.")) {
			System.out.println("correct title...PASS");
		} else {
			System.out.println("incorrect title....FAIL");
		}

		brUtil.quitBrowser();

	}

}
