package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowserLaunchDemo {
	private static WebDriver oBrowser = null;
	public static void main(String[] args) {
		// Fire Fox Browser Launch
		launchBrowser();
	}
	private static void launchBrowser()
	{
		try
		{
			oBrowser = new FirefoxDriver();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}