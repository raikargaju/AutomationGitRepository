package test;


import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowserLaunchDemo {
	public static void main(String[] args) {
		// Fire Fox Browser Launch
		launchBrowser();
	}
	private static void launchBrowser()
	{
		try
		{
			new FirefoxDriver();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}