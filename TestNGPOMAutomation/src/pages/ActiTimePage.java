package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {
	
	public void ActiTime(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	// Create WebElement for User name Text Field
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}
	// Create WebElement for Password Text Field
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}
	//  Create WebElement for Login Button
	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement oLogin;
	public WebElement getLoginButton()
	{
		return oLogin;
	}
	//  Create WebElement for FlyoutWindow
	@FindBy(linkText = "Logout")
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyoutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	
	@FindBy(linkText = "Logout")
	private WebElement oLogout;
	public WebElement getLogout()
	{
		return oLogout;
	}
}
