package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserLaunchDemo {
	public static WebDriver oBrowser = null;
	public static void main(String[] args) {
		// Open ChromeBrowser
		launchBrowser();
	}
	private static void launchBrowser()
	{
		try
		{
			oBrowser = new ChromeDriver();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}