package ani.first.selenium;

public class AmezonTest {

	public static void main(String[] args) {
		BrowserUtil butil=new BrowserUtil();
		butil.InitBrowser("chrome");
butil.launchUrl("https://www.amazon.com/");










butil.browserquit();
	}

}
