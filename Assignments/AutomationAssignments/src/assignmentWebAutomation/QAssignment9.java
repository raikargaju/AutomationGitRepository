package assignmentWebAutomation;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QAssignment9 {
	private  static WebDriver oBrowser = null;
	public static void main(String[] args) {
		/* 9. Launch Browser - Navigate - Login as admin - Create User[User1] - Logout - 
		Login as User1 - Create User[User2] - Logout - Login as User2 - Create [User3] - 
		Logout - Login as User3 - Logout - Login as User2 - Modify password for User3 - 
		Logout - Login as User3 - Logout - Login as User1 - Modify password for User2 - 
		Logout - Login as User2 - Logout - Login as admin - Modify password for User1 - 
		Logout - Login as User1 - Logout ||- Login as User2 - Delete User3 - Logout - 
		Login as User1 - Delete User2 - Logout ||- Login as admin - Delete User1 - 
		Logout - close application. */
		launch();
		navigate();
		logina1();
		createOutU1();
		inU1CeU2out();
		inU2CeU3OutinU3out();
		inU2ModifyU3outinU3out(); 
		inU1ModifyU2outinU2out();
		ina2ModifyU1outinU1out();
		inU2DeleteU3out();
		inU1DeleteU2out();
		logina3();
		deleteU1();
		logout();
		close();
	}
	private static void launch()
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
	private static void logina1()
	{
		try {
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void createOutU1()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("firstName")).sendKeys("User1");
			oBrowser.findElement(By.name("lastName")).sendKeys("A");
			oBrowser.findElement(By.name("email")).sendKeys("user1a@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("User1A");
			oBrowser.findElement(By.name("password")).sendKeys("User1A@123");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("User1A@123");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void inU1CeU2out()
	{
		try {
			oBrowser.findElement(By.id("username")).sendKeys("User1A");
			oBrowser.findElement(By.name("pwd")).sendKeys("User1A@123");
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("firstName")).sendKeys("User2");
			oBrowser.findElement(By.name("lastName")).sendKeys("B");
			oBrowser.findElement(By.name("email")).sendKeys("user2b@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("User2B");
			oBrowser.findElement(By.name("password")).sendKeys("User2B@123");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("User2B@123");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void inU2CeU3OutinU3out()
	{
		try {
			oBrowser.findElement(By.id("username")).sendKeys("User2B");
			oBrowser.findElement(By.name("pwd")).sendKeys("User2B@123");
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("firstName")).sendKeys("User3");
			oBrowser.findElement(By.name("lastName")).sendKeys("C");
			oBrowser.findElement(By.name("email")).sendKeys("user3c@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("User3C");
			oBrowser.findElement(By.name("password")).sendKeys("User3C@123");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("User3C@123");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("username")).sendKeys("User3C");
			oBrowser.findElement(By.name("pwd")).sendKeys("User3C@123");
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void inU2ModifyU3outinU3out()
	{
		try {
			oBrowser.findElement(By.id("username")).sendKeys("User2B");
			oBrowser.findElement(By.name("pwd")).sendKeys("User2B@123");
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys("User3@123");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("User3@123");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("username")).sendKeys("User3C");
			oBrowser.findElement(By.name("pwd")).sendKeys("User3@123");
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);
		} catch (Exception e) {

		}
	}
	private static void inU1ModifyU2outinU2out()
	{
		try {
			oBrowser.findElement(By.id("username")).sendKeys("User1A");
			oBrowser.findElement(By.name("pwd")).sendKeys("User1A@123");
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys("User2@123");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("User2@123");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("username")).sendKeys("User2B");
			oBrowser.findElement(By.name("pwd")).sendKeys("User2@123");
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void ina2ModifyU1outinU1out()
	{
		try {
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys("User1@123");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("User1@123");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("username")).sendKeys("User1A");
			oBrowser.findElement(By.name("pwd")).sendKeys("User1@123");
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void inU2DeleteU3out()
	{
		try {
			oBrowser.findElement(By.id("username")).sendKeys("User2B");
			oBrowser.findElement(By.name("pwd")).sendKeys("User2@123");
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert = oBrowser.switchTo().alert();
			String content = oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void inU1DeleteU2out()
	{
		try {
			oBrowser.findElement(By.id("username")).sendKeys("User1A");
			oBrowser.findElement(By.name("pwd")).sendKeys("User1@123");
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert = oBrowser.switchTo().alert();
			String content = oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void logina3()
	{
		try {
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deleteU1()
	{
		try {
			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='A, User1']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
			Thread.sleep(1000);
			Alert oAlert = oBrowser.switchTo().alert();
			String content = oAlert.getText();
			System.out.println(content);
			oAlert.accept();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void close()
	{
		try {
			oBrowser.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}