package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class W3SchoolFirefoxDemo {
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
				oBrowser.get("https://www.w3schools.com/");
				Thread.sleep(50000);
			}catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void closeapplication()
		{
			try
			{
				oBrowser.quit();
			}catch (Exception e)
			{
				e.printStackTrace();
			}
		}
}