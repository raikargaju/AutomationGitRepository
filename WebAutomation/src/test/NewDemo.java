package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class NewDemo {
	private static WebDriver oBrowser = null;
	public static void main(String[] args) {
		loginLogoutProcess();
	}
	private static void loginLogoutProcess()
	{
		try
		{
			oBrowser = new ChromeDriver();
			oBrowser.manage().window().maximize();
			oBrowser.get("http://localhost/login.do");
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();;
			Thread.sleep(2000);
			oBrowser.findElement(By.linkText("Logout")).click();;
			Thread.sleep(2000);
			oBrowser.close();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}