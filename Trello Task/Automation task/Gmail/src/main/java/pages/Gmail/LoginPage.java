package pages.Gmail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="identifierId") 
	WebElement EmailTxt;
	
	@FindBy(className="VfPpkd-RLmnJb")
	WebElement NextBtn;
	
	@FindBy(css="input[class='whsOnd zHQkBf']")
	WebElement PasswordTxt;
	
	@FindBy(className="o6cuMc")
	public WebElement InvalidValidation;
	
	public void validLogin(String Email,String Password) throws InterruptedException
	{
		setTextElementText(EmailTxt, Email);
		clickButton(NextBtn);
		Thread.sleep(2000);
		setTextElementText(PasswordTxt, Password);
		clickButton(NextBtn);
		Thread.sleep(4000);
	}
	
	public void InvalidLogin(String invalidEmail) throws InterruptedException
	{
		setTextElementText(EmailTxt,invalidEmail );
		clickButton(NextBtn);
		Thread.sleep(2000);
	}
}
