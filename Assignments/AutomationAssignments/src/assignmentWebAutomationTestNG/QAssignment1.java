package assignmentWebAutomationTestNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class QAssignment1 {
	private static WebDriver oBrowser = null;
		// 1. Launch Browser - Navigate - Login - Create User - Delete User - Logout - Close Application.
	@Test(priority = 1)
	private static void launch()
	{
		try {
			oBrowser = new ChromeDriver();
			Assert.assertNotNull(oBrowser);
			oBrowser.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 2,dataProvider = "navigateURL")
	private static void navigate(String url)
	{
		try {
			oBrowser.navigate().to(url);
			String title = oBrowser.getTitle();
			Assert.assertEquals("actiTIME - Login", title);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 3, dataProvider = "loginData")
	private static void login(String user,String pwd)
	{
		try {
			oBrowser.findElement(By.id("username")).sendKeys(user);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(5000);
			WebElement oEle = oBrowser.findElement(By.xpath("//td[text()='Enter Time-Track']"));
			Assert.assertTrue(oEle.isDisplayed());
			
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(5000);
			String attributeValue = oBrowser.findElement(By.id("gettingStartedShortcutsMenuWrapper")).getAttribute("style");
			Assert.assertTrue(attributeValue.equals("display: none;"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 4)
	private static void create()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.name("firstName")).sendKeys("demo");
			oBrowser.findElement(By.name("lastName")).sendKeys("User1");
			oBrowser.findElement(By.name("email")).sendKeys("demo@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("demoUser1");
			oBrowser.findElement(By.name("password")).sendKeys("welcome123");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome123");
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("/html/body/div[1]/div[10]/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div/span")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 5)
	private static void delete()
	{
		try {
			oBrowser.findElement(By.xpath("//span[text()='User1, demo']")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(5000);
			
			Alert oAlert = oBrowser.switchTo().alert();
			String content = oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 6)
	private static void logout()
	{
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(5000);
			String title = oBrowser.getTitle();
			Assert.assertEquals("actiTIME - Login", title);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 7)
	public void closeApplication()
	{
		oBrowser.quit();
		oBrowser = null;
		Assert.assertNull(oBrowser);
	}
	@DataProvider(name = "navigateURL")
	public Object[][] getAppURL()
	{
		return new Object[][] {{"http://localhost/login.do"}};
	}
	
	@DataProvider(name = "loginData")
	public Object[][] getLoginData()
	{
		return new Object[][] {{"admin","manager"}};
	}
}