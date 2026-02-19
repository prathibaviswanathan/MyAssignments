package week3.day2;

public class Chrome extends Browser{
	public void openIncognito() {
		System.out.println("Open InCognito");
	}
	public void clearCache() {
		System.out.println("Clear Cache");
	}
	public static void main(String[] args) {
		Chrome c=new Chrome();
		c.clearCache();
		c.openIncognito();
		c.openURL();
		c.closeBrowser();
		c.navigateBack();
	}

}
