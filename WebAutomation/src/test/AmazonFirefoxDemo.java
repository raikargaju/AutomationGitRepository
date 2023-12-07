package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonFirefoxDemo {
	private static WebDriver oBrowser = null;
	public static void main(String[] args) {
		// launchBrowser, navigate to Amazon.in and close application.
		launchBrowser();
		navigate();
		closeapplication();
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
	private static void navigate()
	{
		try
		{
			oBrowser.get("https://www.amazon.in/");
			Thread.sleep(5000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeapplication()
	{
		try
		{
			oBrowser.close();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}