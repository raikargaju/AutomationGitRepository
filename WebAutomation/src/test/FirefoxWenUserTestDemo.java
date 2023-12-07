package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxWenUserTestDemo {
	private static WebDriver oBrowser = null;
	public static void main(String[] args) {
		launch();
		navigate();
		login();
		addUser();
	}
	private static void launch()
	{
		try
		{
			oBrowser = new FirefoxDriver();
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
			Thread.sleep(1000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[5]/td/table[1]/tbody/tr[2]/td/table/tbody/tr/td[3]/a/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();
			Thread.sleep(1000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void addUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("/html/body/div[4]/table/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[2]/td[2]/div/div/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Demo");
			oBrowser.findElement(By.name("lastName")).sendKeys("Demo1");
			oBrowser.findElement(By.name("email")).sendKeys("Demo12@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("Demo123");
			oBrowser.findElement(By.name("password")).sendKeys("Demo@123");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Demo@123");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("/html/body/div[1]/div[10]/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div/span")).click();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}