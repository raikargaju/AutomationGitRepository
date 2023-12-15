package popUpBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpBrowserDemo {
	public static WebDriver oBrowser = null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		popupBrowsers();
	}
	private static void launchBrowser()
	{
		try {
			oBrowser = new ChromeDriver();
			oBrowser.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try {
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void popupBrowsers()
	{
		try {
			WebElement oEle = oBrowser.findElement(By.linkText("actiTIME Inc."));
			System.out.println("Before click on the link, # of Popup are :"+getPopupCount());
			oEle.click();
			Thread.sleep(5000);
			System.out.println("after click on the link, # of Popup are :"+getPopupCount());
			if(getPopupCount() > 0)
			{
				handlePopups();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static int getPopupCount()
	{
		int count = 0;
		count = oBrowser.getWindowHandles().size()-1;
		return count;
	}
	private static void handlePopups()
	{
		String parentBrowser = null;
		Object popups[];
		try {
			parentBrowser = oBrowser.getWindowHandle();
			System.out.println("Parent Browser :"+parentBrowser);
			popups = oBrowser.getWindowHandles().toArray();
			for(int i = 1;i < popups.length;i++)
			{
				String childBrowser = popups[i].toString();
				System.out.println("Child Browser :"+childBrowser);
				Thread.sleep(5000);
				oBrowser.switchTo().window(childBrowser);
				Thread.sleep(5000);
				String title = oBrowser.getTitle();
				System.out.println("Child Browser Title :"+title);
				String Url = oBrowser.getCurrentUrl();
				System.out.println("Child Browser URL :"+Url);
				oBrowser.findElement(By.linkText("Try Free")).click();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}