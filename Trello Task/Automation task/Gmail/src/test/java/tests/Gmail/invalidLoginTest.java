package tests.Gmail;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Gmail.LoginPage;

public class invalidLoginTest extends TestBase {
	
	LoginPage LoginPageObj;
	String invalidEmail="asd848ad5d1a85d48";
	
	@Test
	public void UserCantLogin() throws InterruptedException
	{
		LoginPageObj=new LoginPage(driver);
		LoginPageObj.InvalidLogin(invalidEmail);
		Thread.sleep(2000);
		System.out.println(LoginPageObj.InvalidValidation.getText());
		Assert.assertTrue(LoginPageObj.InvalidValidation.getText().contains("Couldn’t find your Google Account"));
	}
}
