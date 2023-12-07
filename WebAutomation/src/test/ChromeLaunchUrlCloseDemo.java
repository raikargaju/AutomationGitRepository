package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunchUrlCloseDemo {
	public static WebDriver oBrowser = null;
	public static void main(String[] args) {
		// launchBrowser, navigate and close application.
		launchBrowser();
		navigate();
		closeapplication();
	}
	private static void launchBrowser()
	{
		try
		{
			oBrowser = new ChromeDriver();
			oBrowser.manage().window().maximize();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
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