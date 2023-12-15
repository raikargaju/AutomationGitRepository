package test;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLoginLogout {
	public static void main(String[] args) {
		// 
		launchBrowser();
	}
	private static void launchBrowser()
	{
		try
		{
			new ChromeDriver();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}