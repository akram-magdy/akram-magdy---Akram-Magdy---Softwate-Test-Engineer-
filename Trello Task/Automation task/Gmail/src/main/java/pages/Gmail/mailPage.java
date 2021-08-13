package pages.Gmail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class mailPage  extends PageBase{
	
	public mailPage(WebDriver driver) {
		super(driver);
	}


	@FindBy(xpath="//*[@id=\"gb\"]/div[2]/div[3]/div[1]/div[2]/div/a/img")
	WebElement GoogleAccountMenu;
	
	@FindBy(xpath="//*[@id=\"gb\"]/div[2]/div[4]/div[1]/div[2]/div[1]")
	public WebElement AccountName;
	
	@FindBy(id="gb_71")
	WebElement SignOutBtn;
	
	@FindBy(className="cRiDhf")
	public WebElement ValidationMassage;
	
	
	public void OpenProfile()
	{
		clickButton(GoogleAccountMenu);
	}
	
	public void SignOut()
	{
		clickButton(SignOutBtn);
	}

}
