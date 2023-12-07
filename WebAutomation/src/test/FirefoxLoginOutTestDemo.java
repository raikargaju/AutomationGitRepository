package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLoginOutTestDemo {
	private static WebDriver oBrowser = null;
	public static void main(String[] args) {
		// Firefox-navigate-login and logout
		loginLogout();
	}
	private static void loginLogout()
	{
		try
		{
			oBrowser = new FirefoxDriver();
			oBrowser.manage().window().maximize();
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[5]/td/table[1]/tbody/tr[2]/td/table/tbody/tr/td[3]/a/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(5000);
			oBrowser.close();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}