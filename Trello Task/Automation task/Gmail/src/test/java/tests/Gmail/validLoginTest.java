package tests.Gmail;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Gmail.LoginPage;
import pages.Gmail.mailPage;

public class validLoginTest extends TestBase{
	
	LoginPage LoginPageObj;
	mailPage MailPageObj;
	String Email="tt7973638";
	String Password="Test@123456";
	
	@Test
	public void UserCanLogin() throws InterruptedException
	{
		LoginPageObj=new LoginPage(driver);
		LoginPageObj.validLogin(Email, Password);
		Thread.sleep(3000);
		MailPageObj = new mailPage(driver);
		MailPageObj.OpenProfile();
		System.out.println(MailPageObj.AccountName.getText());
		Assert.assertTrue(MailPageObj.AccountName.getText().contains("test"));
		MailPageObj.SignOut();
		System.out.println(MailPageObj.ValidationMassage.getText());
		Assert.assertTrue(MailPageObj.ValidationMassage.getText().contains("الخروج"));
		Thread.sleep(3000);
	}

}
